package edu.ufsj.controller.strategy.behaviors;

import edu.ufsj.controller.strategy.interfaces.UsuarioLoginStrategy;
import edu.ufsj.exception.FalhaAutenticacaoUsuarioException;

public class NoLoginBehavior implements UsuarioLoginStrategy {

	@Override
	public void realizarLogin(String login, String password) throws FalhaAutenticacaoUsuarioException {
		throw new UnsupportedOperationException("Essa estratégia não realiza esse comportamento");
	}
}
