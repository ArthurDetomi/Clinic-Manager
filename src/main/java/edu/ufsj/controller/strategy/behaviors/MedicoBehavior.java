package edu.ufsj.controller.strategy.behaviors;

import java.util.List;

import edu.ufsj.controller.Controller;
import edu.ufsj.controller.UsuarioController;
import edu.ufsj.controller.strategy.interfaces.ControllerStrategy;
import edu.ufsj.model.Medico;
import edu.ufsj.persistence.ConsultaDao;
import edu.ufsj.persistence.MedicoDao;
import edu.ufsj.persistence.UsuarioDao;

public class MedicoBehavior implements ControllerStrategy {

	private final UsuarioDao usuarioDao = UsuarioDao.getInstance();

	private final MedicoDao medicoDao = MedicoDao.getInstance();

	private final ConsultaDao consultaDao = ConsultaDao.getInstance();

	@Override
	public boolean cadastrar(Object medicoObj) throws Exception {
		if (!(medicoObj instanceof Medico)) {
			throw new ClassCastException();
		}

		Medico medico = (Medico) medicoObj;

		Controller usuarioController = new UsuarioController();

		boolean usuarioFoiCadastrado = usuarioController.cadastrar(medico);

		if (!usuarioFoiCadastrado) {
			return false;
		}

		Integer id = usuarioDao.findIdByLogin(medico.getLogin());

		medico.setId(id);

		return medicoDao.create(medico);
	}

	@Override
	public boolean excluir(Integer idMedico) {
		consultaDao.deleteConsultasByMedicoId(idMedico);

		boolean deletionSuccessful = medicoDao.delete(idMedico);

		if (!deletionSuccessful) {
			return false;
		}

		return usuarioDao.delete(idMedico);
	}

	@Override
	public List<?> findAll() {
		return medicoDao.findAll();
	}

	@Override
	public List<?> findByStringSearch(String searchText) {
		if (searchText.isBlank()) {
			return medicoDao.findAll();
		}

		return medicoDao.findByNomeOrCpfOrCrm(searchText);
	}
}
