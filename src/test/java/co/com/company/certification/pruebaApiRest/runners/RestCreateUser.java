package co.com.company.certification.pruebaApiRest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/create_user.feature"},
        glue = {"co.com.company.certification.pruebaApiRest.stepsdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RestCreateUser {
}
