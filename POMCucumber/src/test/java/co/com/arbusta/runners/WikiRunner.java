package co.com.arbusta.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"co.com.arbusta.stepsdefinitions"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty"}
)
public class WikiRunner {
/** llamado de Features --< ubicacion
 * llamado de ubicacion de steps definitions 
 * para correr la prueba debo de ejecutar esta clase.
**/
}
