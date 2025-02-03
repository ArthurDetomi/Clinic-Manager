package edu.ufsj.controller.strategy.interfaces;

import java.util.List;

import edu.ufsj.model.Consulta;
import edu.ufsj.utils.Response;

public interface ConsultaStrategy {
	Response<Consulta> cadastrarConsulta(Consulta consulta);

	Response<Consulta> finalizarConsulta(Consulta consulta);

	List<Consulta> findAllConsultasDeHoje();

	Response<Consulta> excluirConsultaById(Integer idConsulta);

}
