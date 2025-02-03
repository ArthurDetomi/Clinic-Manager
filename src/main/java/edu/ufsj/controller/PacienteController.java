package edu.ufsj.controller;

import edu.ufsj.controller.strategy.behaviors.PacienteBehavior;
import edu.ufsj.controller.strategy.behaviors.NoConsultaBehavior;
import edu.ufsj.controller.strategy.behaviors.NoLoginBehavior;

public class PacienteController extends Controller {

	public PacienteController() {
		super(new PacienteBehavior(), new NoConsultaBehavior(), new NoLoginBehavior());
	}

}
