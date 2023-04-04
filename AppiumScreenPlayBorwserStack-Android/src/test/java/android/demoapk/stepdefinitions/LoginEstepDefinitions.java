package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import static android.demoapk.task.IniciarSesionTask.iniciarSesionTask;

public class LoginEstepDefinitions {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginEstepDefinitions.class));
    protected Actor actor = Actor.named("Yoli");
    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() throws MalformedURLException {
        actor.can(BrowseTheWeb.
                        with(AndroidDriverr.configureDriver().start()));

    }

    @When("User introduce the valid credentials standard_user secret_sauce")
    public void userIntroduceTheValidCredentialsStandardUserSecretSauce() {
        try {

            actor.attemptsTo(
                    iniciarSesionTask ()
                            .conUser("standard_user")
                            .yPass("secret_sauce")
            );


        } catch (Exception e) {
            LOGGER.info(" Fallo al ingresar user y pass");
            LOGGER.warning(e.getMessage());
            Assertions.fail(e.getMessage());

        }
    }

    @When("User selects the product")
    public void userSelectsTheProduct() {

    }
    @Then("User should see payment information")
    public void userShouldSeePaymentInformation() {

    }
}
