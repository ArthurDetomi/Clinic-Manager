package edu.ufsj.controller;

import edu.ufsj.controller.strategy.behaviors.UsuarioBehavior;
import edu.ufsj.controller.strategy.behaviors.NoConsultaBehavior;

public class UsuarioController extends Controller {
    public UsuarioController() {
        super(new UsuarioBehavior(), new NoConsultaBehavior(), new UsuarioBehavior());
    }
}
