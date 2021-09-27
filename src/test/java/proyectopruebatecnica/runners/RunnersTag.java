package proyectopruebatecnica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pruebatecnica.feature",
        tags = "@stories",
        glue = "proyectopruebatecnica.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnersTag {
}
