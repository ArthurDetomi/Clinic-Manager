package edu.ufsj.controller.strategy.interfaces;

import edu.ufsj.model.Consulta;

import java.util.List;

public interface ControllerStrategy {
	boolean cadastrar(Object object) throws Exception;

	boolean excluir(Integer id);

	List<?> findAll();

	List<?> findByStringSearch(String searchText);
}
