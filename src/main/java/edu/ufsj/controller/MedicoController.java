package edu.ufsj.controller;

import edu.ufsj.controller.strategy.behaviors.MedicoBehavior;
import edu.ufsj.controller.strategy.behaviors.NoConsultaBehavior;
import edu.ufsj.controller.strategy.behaviors.NoLoginBehavior;

public class MedicoController extends Controller {
	public MedicoController() {
		super(new MedicoBehavior(), new NoConsultaBehavior(), new NoLoginBehavior());
	}
}
