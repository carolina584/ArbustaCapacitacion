package co.com.arbusta.stepsdefinitions;

import co.com.arbusta.steps.WikiSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WikiStepDefinitions {

	@Steps
	WikiSteps steps;


	@Given("^usuario ingresa a la pagina de Wikipedia$")
	public void usuario_ingresa_a_la_pagina_de_Wikipedia() throws Exception {
		steps.abrePaginaDeWiki();
		
	}

	@When("^usuario busca la palabra$")
	public void usuario_busca_la_palabra() throws Exception {
		steps.escribePalabra();
	}

	@Then("^usuario visualiza la defincion$")
	public void usuario_visualiza_la_defincion() throws Exception {
		steps.verificacion();
	}
}
