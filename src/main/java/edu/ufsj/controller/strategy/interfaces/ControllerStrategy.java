package edu.ufsj.controller.strategy.interfaces;

import java.util.List;

public interface ControllerStrategy {
	boolean cadastrar(Object object) throws Exception;

	boolean excluir(Integer id);

	List<?> findAll();

	List<?> findByStringSearch(String searchText);
}
