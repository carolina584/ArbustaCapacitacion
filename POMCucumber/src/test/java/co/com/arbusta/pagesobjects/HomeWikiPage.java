package co.com.arbusta.pagesobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://es.wikipedia.org/wiki/Wikipedia:Portadam")
public class HomeWikiPage extends PageObject{

	//localizacion de los elementos
	@FindBy(how = How.XPATH, using = "//input[@name='search']")
    public WebElement inputBuscar;
	
	@FindBy(how = How.XPATH, using = "//*[@id='firstHeading']")
    public WebElement titulo;
	
	
	//creacion de metodos que realizan las acciones
	public void buscarPalabra() {
	
		try {
			inputBuscar.sendKeys("Selenium");
			Thread.sleep(4000);
			inputBuscar.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	public boolean validarPalabra() {
		
		String validaTitulo = titulo.getText().toString();
		if (validaTitulo.equals("Selenium")) {
			System.out.println("Validacion de titulo correcta" +  validaTitulo);
			return true;
		}
		return false;
	}	
}
