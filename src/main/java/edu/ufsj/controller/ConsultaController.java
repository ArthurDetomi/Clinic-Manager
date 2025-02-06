package edu.ufsj.controller;

import edu.ufsj.controller.strategy.behaviors.ConsultaBehavior;
import edu.ufsj.controller.strategy.behaviors.NoLoginBehavior;

public class ConsultaController extends Controller{
    public ConsultaController() {
        super(new ConsultaBehavior(), new ConsultaBehavior(), new NoLoginBehavior());
    }
}
