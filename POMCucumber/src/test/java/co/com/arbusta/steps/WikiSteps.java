package co.com.arbusta.steps;

import co.com.arbusta.pagesobjects.HomeWikiPage;
import cucumber.api.java.nl.Stel;
import net.thucydides.core.annotations.Step;

public class WikiSteps {

	HomeWikiPage wiki;
	
	/**
	 * Los pasos que creamos en esta clase, los permiten hacer un llamado de los metodos pageObjects
	 * */
	
	@Step("Abrir la pagina principal de wiki")
	public void abrePaginaDeWiki() {
		wiki.open();
	}
	
	@Step("Buscar Palabra")
	public void escribePalabra() {
		wiki.buscarPalabra();
	}
	@Step("validacion")
	public void verificacion() {
		wiki.validarPalabra();
	}
}
