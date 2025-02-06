package edu.ufsj.controller.strategy.interfaces;

import edu.ufsj.exception.FalhaAutenticacaoUsuarioException;

public interface UsuarioLoginStrategy {
	void realizarLogin(String login, String password) throws FalhaAutenticacaoUsuarioException;
}
