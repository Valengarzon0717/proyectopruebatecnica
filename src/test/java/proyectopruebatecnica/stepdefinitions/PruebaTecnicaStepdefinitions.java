package proyectopruebatecnica.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyectopruebatecnica.questions.Answer;
import proyectopruebatecnica.tasks.JoinToday;
import proyectopruebatecnica.tasks.OpenUp;
import proyectopruebatecnica.tasks.Register;


public class PruebaTecnicaStepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^since Valentina entered the platform$")
    public void sinceValentinaEnteredThePlatform() {
        OnStage.theActorCalled("Valentina").wasAbleTo(OpenUp.thePage(), JoinToday.OnthePage());

    }

    @When("^she you register$")
    public void sheYouRegister() {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.theform());

    }

    @Then("^click enter$")
    public void clickEnter(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(question)));

    }
}
