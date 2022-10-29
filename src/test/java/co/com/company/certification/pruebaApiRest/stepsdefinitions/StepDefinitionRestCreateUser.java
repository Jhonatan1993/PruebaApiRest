package co.com.company.certification.pruebaApiRest.stepsdefinitions;

import co.com.company.certification.pruebaApiRest.models.ModelCreateUserRest;
import co.com.company.certification.pruebaApiRest.questions.LastResponseStatusCode;
import co.com.company.certification.pruebaApiRest.tasks.CreateUserRest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;

import static co.com.company.certification.pruebaApiRest.utils.Constant.VALUE;
import static co.com.company.certification.pruebaApiRest.utils.enums.RestService.BASE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepDefinitionRestCreateUser {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jhonatan").whoCan(CallAnApi.at(BASE_URL.toString()));
    }

    @When("you create an user")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRest) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUserRest.with(modelCreateUserRest));
    }
    @Then("I should see the user created")
    public void iShouldSeeTheUserCreated() {
        OnStage.theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));


    }
}
