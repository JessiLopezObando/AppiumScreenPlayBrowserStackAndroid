package com.sofkau.stepdefinition;

import com.sofkau.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import static com.sofkau.question.MensajeLogout.mensajeLogout;
import static com.sofkau.task.CierreSesion.cierreSesion;
import static com.sofkau.task.IniciarSesion.iniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LogoutStepDefinition extends AndroidDriver {

    private static Logger LOGGER = Logger.getLogger(LogoutStepDefinition.class);

    Actor ACTOR = Actor.named("James");

    @Given("que ingresamos a la aplicacion swaglabs")
    public void queIngresamosALaAplicacionSwaglabs() {
        try {
            ACTOR.can(BrowseTheWeb.with(AndroidDriver.configureDriver().start()));
            LOGGER.info("Inicia la automatizacion");
        } catch (Exception e) {
            LOGGER.info("Fallo la configuracion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        }
    }

    @When("iniciamos sesion en la aplicacion")
    public void iniciamosSesionEnLaAplicacion() {
        try {
            ACTOR.attemptsTo(
                    iniciarSesion().credenciales("standard_user","secret_sauce")
            );
            LOGGER.info("Se inicia sesion");
        }catch (Exception e){
            LOGGER.info("Fallo al iniciar la sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();

        }
    }

    @When("realizamos el cierre de sesion")
    public void realizamosElCierreDeSesion() {
        try {
            ACTOR.attemptsTo(
                    cierreSesion()
            );
            LOGGER.info("Se realiza el cierre de sesion");
        } catch (Exception e) {
            LOGGER.info("Fallo el cierre de sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();

        }
    }

    @Then("debemos volver al menu de inicio de sesion")
    public void debemosVolverAlMenuDeInicioDeSesion() {
        try {
            ACTOR.should(
                    seeThat(mensajeLogout(), containsString("LOGIN"))
            );
            LOGGER.info("Hace la comparacion");
        } catch (Exception e) {
            LOGGER.info("Fallo la comparacion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        }
    }
}

