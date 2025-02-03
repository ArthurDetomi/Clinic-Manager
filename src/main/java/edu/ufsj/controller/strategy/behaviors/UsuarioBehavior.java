package edu.ufsj.controller.strategy.behaviors;

import edu.ufsj.controller.strategy.interfaces.ControllerStrategy;
import edu.ufsj.controller.strategy.interfaces.UsuarioLoginStrategy;
import edu.ufsj.persistence.UsuarioDao;
import edu.ufsj.exception.FalhaAutenticacaoUsuarioException;
import edu.ufsj.exception.UsuarioJaExisteException;
import edu.ufsj.model.TipoUsuario;
import edu.ufsj.model.Usuario;
import edu.ufsj.service.UserSession;

import java.util.List;

public class UsuarioBehavior implements ControllerStrategy, UsuarioLoginStrategy {

	private final UsuarioDao usuarioDao = UsuarioDao.getInstance();

	@Override
	public boolean cadastrar(Object usuarioObj) throws Exception {
		if (!(usuarioObj instanceof Usuario)) {
			throw new ClassCastException();
		}

		Usuario usuario = (Usuario) usuarioObj;

		if (usuarioDao.findIdByLogin(usuario.getLogin()) != null) {
			throw new UsuarioJaExisteException("Já existe um usuário com mesmo Login");
		}

		if (usuarioDao.existsByCpf(usuario.getCpf())) {
			throw new UsuarioJaExisteException("Já existe um usuário com mesmo CPF");
		}

		return usuarioDao.create(usuario);
	}

	@Override
	public boolean excluir(Integer id) {
		return usuarioDao.delete(id);
	}

	@Override
	public List<?> findAll() {
		return usuarioDao.findAllByTipoUsuario(TipoUsuario.ATENDENTE);
	}

	@Override
	public List<?> findByStringSearch(String searchText) {
		if (searchText.isBlank()) {
			return usuarioDao.findAllByTipoUsuario(TipoUsuario.ATENDENTE);
		}

		return usuarioDao.findAllByTipoUsuarioAndStringSearch(TipoUsuario.ATENDENTE, searchText);
	}

	@Override
	public void realizarLogin(String login, String password) throws FalhaAutenticacaoUsuarioException {
		Usuario usuario = usuarioDao.findByLoginAndPassword(login, password);

		if (usuario == null) {
			throw new FalhaAutenticacaoUsuarioException();
		}

		UserSession.getInstance().setLoggedUser(usuario);
	}
}
