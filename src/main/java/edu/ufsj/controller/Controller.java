package edu.ufsj.controller;

import java.util.List;

import edu.ufsj.controller.strategy.interfaces.ConsultaStrategy;
import edu.ufsj.controller.strategy.interfaces.ControllerStrategy;
import edu.ufsj.controller.strategy.interfaces.UsuarioLoginStrategy;
import edu.ufsj.exception.FalhaAutenticacaoUsuarioException;
import edu.ufsj.model.Consulta;
import edu.ufsj.utils.Response;

public abstract class Controller {

	protected ControllerStrategy controllerStrategy;
	protected ConsultaStrategy consultaStrategy;
	protected UsuarioLoginStrategy usuarioLoginStrategy;

	public Controller(ControllerStrategy controllerStrategy, ConsultaStrategy consultaStrategy,
			UsuarioLoginStrategy usuarioLoginStrategy) {
		this.controllerStrategy = controllerStrategy;
		this.consultaStrategy = consultaStrategy;
		this.usuarioLoginStrategy = usuarioLoginStrategy;
	}

	public boolean cadastrar(Object object) throws Exception {
		return controllerStrategy.cadastrar(object);
	}

	public boolean excluir(Integer id) {
		return controllerStrategy.excluir(id);
	}

	public List<?> findAll() {
		return controllerStrategy.findAll();
	}

	public List<?> findByStringSearch(String searchText) {
		return controllerStrategy.findByStringSearch(searchText);
	}

	public List<Consulta> findAllConsultasDeHoje() {
		return consultaStrategy.findAllConsultasDeHoje();
	}

	public Response<Consulta> finalizarConsulta(Consulta consulta) {
		return consultaStrategy.finalizarConsulta(consulta);
	}

	public Response<Consulta> cadastrarConsulta(Consulta consulta) {
		return consultaStrategy.cadastrarConsulta(consulta);
	}

	public void realizarLogin(String login, String password) throws FalhaAutenticacaoUsuarioException {
		usuarioLoginStrategy.realizarLogin(login, password);
	}

	public Response<Consulta> excluirConsultaById(Integer idConsulta) {
		return consultaStrategy.excluirConsultaById(idConsulta);
	}


}
