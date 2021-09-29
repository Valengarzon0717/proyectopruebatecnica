package proyectopruebatecnica.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyectopruebatecnica.model.PruebaTecnicaData;
import proyectopruebatecnica.questions.Answer;
import proyectopruebatecnica.tasks.JoinToday;
import proyectopruebatecnica.tasks.OpenUp;
import proyectopruebatecnica.tasks.Register;

import java.util.List;


public class PruebaTecnicaStepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^since Valentina entered the platform$")
    public void sinceValentinaEnteredThePlatform(List<PruebaTecnicaData> pruebaTecnicaData) throws Exception{
        OnStage.theActorCalled("Valentina").wasAbleTo(OpenUp.thePage(), JoinToday.OnthePage());

    }

    @When("^she you register$")
    public void sheYouRegister(List<PruebaTecnicaData> pruebaTecnicaData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.theform(pruebaTecnicaData.get(0).getStarFirtsname(),
                pruebaTecnicaData.get(0).getStrLastname(),pruebaTecnicaData.get(0).getStrEmail(),
                pruebaTecnicaData.get(0).getStrCity(),pruebaTecnicaData.get(0).getStrPostalcode(),
                pruebaTecnicaData.get(0).getStrCountry(),pruebaTecnicaData.get(0).getStrPassword(),
                pruebaTecnicaData.get(0).getStrConfirmPassword()));

    }

    @Then("^click enter$")
    public void clickEnter(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(question)));

    }
}
