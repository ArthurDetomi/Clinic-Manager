package edu.ufsj.controller.strategy.behaviors;

import edu.ufsj.controller.strategy.interfaces.ConsultaStrategy;
import edu.ufsj.model.Consulta;
import edu.ufsj.utils.Response;

import java.util.List;

public class NoConsultaBehavior implements ConsultaStrategy {

    @Override
    public List<Consulta> findAllConsultasDeHoje() {
        throw new UnsupportedOperationException("Essa estratégia não realiza esse comportamento");
    }

    @Override
    public Response<Consulta> excluirConsultaById(Integer idConsulta) {
        throw new UnsupportedOperationException("Essa estratégia não realiza esse comportamento");
    }

    @Override
    public Response<Consulta> finalizarConsulta(Consulta consulta) {
        throw new UnsupportedOperationException("Essa estratégia não realiza esse comportamento");
    }

    @Override
    public Response<Consulta> cadastrarConsulta(Consulta consulta) {
        throw new UnsupportedOperationException("Essa estratégia não realiza esse comportamento");
    }
}
