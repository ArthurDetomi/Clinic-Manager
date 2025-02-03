package edu.ufsj.controller.strategy.behaviors;


import edu.ufsj.controller.strategy.interfaces.ControllerStrategy;
import edu.ufsj.persistence.ConsultaDao;
import edu.ufsj.persistence.PacienteDao;
import edu.ufsj.exception.PacienteJaExisteException;
import edu.ufsj.model.Paciente;

import java.util.List;

public class PacienteBehavior implements ControllerStrategy {

	private final PacienteDao pacienteDao = PacienteDao.getInstance();
	private final ConsultaDao consultaDao = ConsultaDao.getInstance();

	@Override
	public boolean cadastrar(Object pacienteObj) throws Exception {
		if (!(pacienteObj instanceof Paciente)) {
			throw new ClassCastException();
		}

		Paciente paciente = (Paciente) pacienteObj;

		if (pacienteDao.existsByCpf(paciente.getCpf())) {
			throw new PacienteJaExisteException("Já existe um paciente com mesmo CPF cadastrado");
		}

		return pacienteDao.create(paciente);
	}

	@Override
	public boolean excluir(Integer idPaciente) {
		consultaDao.deleteConsultasByPacienteId(idPaciente);

		return pacienteDao.delete(idPaciente);
	}

	@Override
	public List<?> findAll() {
		return pacienteDao.findAll();
	}

	@Override
	public List<?> findByStringSearch(String searchText) {
		if (searchText.isBlank()) {
			return pacienteDao.findAll();
		}

		return pacienteDao.findByNomeOrCpf(searchText);
	}
}
