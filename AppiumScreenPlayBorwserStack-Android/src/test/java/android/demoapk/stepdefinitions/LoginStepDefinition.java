package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import android.demoapk.setup.Configuracion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;

import static android.demoapk.tasks.IniciarSesion.iniciarSesion;
import static android.demoapk.util.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static android.demoapk.questions.MensajeLogin.mensajeLogin;
import static org.hamcrest.Matchers.equalTo;


public class LoginStepDefinition extends Configuracion {

    public static Logger LOGGER = Logger.getLogger(LoginStepDefinition.class);

    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() {
        try {
            setUplog4j();
            actor.can(BrowseTheWeb.with(AndroidDriverr.configureDriver().start()));
            LOGGER.info("INICIO AUTOMATIZACION");
        } catch (Exception e){
            LOGGER.info("Fallo en la configuracion inicial");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
        }
    }
    @When("User introduce the valid credentials standard_user secret_sauce")
    public void userIntroduceTheValidCredentialsStandardUserSecretSauce() {
        try {
            actor.attemptsTo(
                    iniciarSesion()
                            .withTheUser(USER)
                            .andThePassword(PASSWORD)
            );
        } catch (Exception e){
            LOGGER.info("Fallo iniciando sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
        }
    }
    @Then("User should see the Products list")
    public void userShouldSeeTheProductsList() {
        try {
            actor.should(
                seeThat(mensajeLogin(), equalTo(PRODUCTS))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e){
            LOGGER.info("fallo en la comparacion de resultados");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
        }
    }

    protected Actor actor = Actor.named("User");
    @Managed(driver = "Appium")
    protected WebDriver theMobileDevice;
}
