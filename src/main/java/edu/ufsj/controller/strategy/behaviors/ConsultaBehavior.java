package edu.ufsj.controller.strategy.behaviors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import edu.ufsj.controller.strategy.interfaces.ConsultaStrategy;
import edu.ufsj.controller.strategy.interfaces.ControllerStrategy;
import edu.ufsj.model.Consulta;
import edu.ufsj.persistence.ConsultaDao;
import edu.ufsj.utils.DateUtil;
import edu.ufsj.utils.Response;

public class ConsultaBehavior implements ControllerStrategy, ConsultaStrategy {

	private ConsultaDao consultaDao = ConsultaDao.getInstance();

	@Override
	public Response<Consulta> cadastrarConsulta(Consulta consulta) {
		if (!consulta.isValidForRegisterBD()) {
			return new Response<>(false, "Dados de consulta estão preenchidos incorretamente");
		}

		LocalDateTime dataAgendamento = consulta.getDataAgendamento();

		if (dataAgendamento.toLocalDate().isBefore(LocalDate.now())) {
			return new Response<>(false, "Data de agendamento incorreta");
		}

		LocalDateTime lastDataAgendamento = consultaDao.findLastDataAgendamento(consulta);

		if (lastDataAgendamento != null) {
			LocalDateTime lastDataAgendamentoPlusFifteenMinutes = lastDataAgendamento.plusMinutes(15);
			LocalDateTime lastDataAgendamentoMinusFifteenMinutes = lastDataAgendamento.minusMinutes(15);

			if (dataAgendamento.isBefore(lastDataAgendamentoPlusFifteenMinutes)
					&& dataAgendamento.isAfter(lastDataAgendamentoMinusFifteenMinutes)) {
				return new Response<>(false, "Horário de consulta deve ser posterior a "
						+ DateUtil.formatterPadraoDataHora.format(lastDataAgendamentoPlusFifteenMinutes));
			}
		}

		boolean registeredSuccess = consultaDao.create(consulta);

		if (!registeredSuccess) {
			return new Response<>(false, "Falha ao cadastrar consulta");
		}

		return new Response<>(true, "Consulta cadastrada com sucesso");
	}

	@Override
	public List<Consulta> findAllConsultasDeHoje() {
		return consultaDao.findAllConsultasDeHoje();
	}

	@Override
	public Response<Consulta> finalizarConsulta(Consulta consulta) {
		LocalDateTime dataAgendamento = consulta.getDataAgendamento();

		if (consulta.isConsultaRealizada()) {
			return new Response<>(false, "Consulta já foi realizada");
		}

		if (consulta.getId() == null || dataAgendamento == null) {
			return new Response<>(false, "Consulta selecionada inválida");
		}

		if (!dataAgendamento.toLocalDate().equals(LocalDate.now())) {
			return new Response<>(false, "Somente consultas de hoje podem ser finalizadas");
		}

		if (dataAgendamento.isAfter(LocalDateTime.now().plusMinutes(1))) {
			return new Response<>(false, "Não se pode finalizar consultas futuras");
		}

		boolean consultaFinalizadaComSucesso = consultaDao.finalizarConsulta(consulta);

		if (!consultaFinalizadaComSucesso) {
			return new Response<>(false, "Falha ao finalizar consulta");
		}

		return new Response<>(true, "Consulta finalizada com sucesso");
	}

	@Override
	public Response<Consulta> excluirConsultaById(Integer idConsulta) {
		if (idConsulta == null) {
			return new Response<>(false, "Consulta para exclusão inválida");
		}

		boolean deletionSuccess = consultaDao.delete(idConsulta);

		if (!deletionSuccess) {
			return new Response<>(false, "Falha ao excluir consulta");
		}

		return new Response<>(true, "Consulta excluida com sucesso");
	}

	@Override
	public boolean cadastrar(Object consultaObj) throws Exception {
		if (!(consultaObj instanceof Consulta)) {
			throw new IllegalAccessException("Provavelmente uso de estratégia incorreto");
		}

		Consulta consulta = (Consulta) consultaObj;

		if (!consulta.isValidForRegisterBD()) {
			return false;
		}

		LocalDateTime dataAgendamento = consulta.getDataAgendamento();

		if (dataAgendamento.toLocalDate().isBefore(LocalDate.now())) {
			return false;
		}

		LocalDateTime lastDataAgendamento = consultaDao.findLastDataAgendamento(consulta);

		if (lastDataAgendamento != null) {
			LocalDateTime lastDataAgendamentoPlusFifteenMinutes = lastDataAgendamento.plusMinutes(15);
			LocalDateTime lastDataAgendamentoMinusFifteenMinutes = lastDataAgendamento.minusMinutes(15);

			if (dataAgendamento.isBefore(lastDataAgendamentoPlusFifteenMinutes)
					&& dataAgendamento.isAfter(lastDataAgendamentoMinusFifteenMinutes)) {
				return false;
			}
		}

		boolean registeredSuccess = consultaDao.create(consulta);

		if (!registeredSuccess) {
			return false;
		}

		return true;
	}

	@Override
	public boolean excluir(Integer idConsulta) {
		if (idConsulta == null) {
			return false;
		}

		boolean deletionSuccess = consultaDao.delete(idConsulta);

		if (!deletionSuccess) {
			return false;
		}

		return true;
	}

	@Override
	public List<Consulta> findAll() {
		return consultaDao.findAll();
	}

	@Override
	public List<Consulta> findByStringSearch(String searchText) {
		if (searchText.isBlank()) {
			return consultaDao.findAll();
		}

		return consultaDao.findAllByStringSearch(searchText);
	}
}
