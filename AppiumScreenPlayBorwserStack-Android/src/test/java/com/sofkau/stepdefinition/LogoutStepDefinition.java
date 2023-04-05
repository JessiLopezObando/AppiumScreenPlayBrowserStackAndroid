package com.sofkau.stepdefinition;

import com.sofkau.setup.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.question.MensajeLogout.mensajeLogout;
import static com.sofkau.task.CierreSesion.cierreSesion;
import static com.sofkau.task.IniciarSesion.iniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LogoutStepDefinition extends AndroidDriver {
    private static Logger LOGGER = Logger.getLogger(LogoutStepDefinition.class);

    @Given("que ingreso a la aplicacion swaglabs")
    public void queIngresoALaAplicacionSwaglabs() {
        try {
            configurarCelular();
            LOGGER.info("Inicia la automatizacion");
        } catch (Exception e) {
            LOGGER.info("Fallo la configuracion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("inicio sesion en la aplicacion")
    public void inicioSesionEnLaAplicacion() {
        try {
            ACTOR.attemptsTo(
                    iniciarSesion().credenciales("standard_user", "secret_sauce")
            );
            LOGGER.info("Se inicia sesion");
        } catch (Exception e) {
            LOGGER.info("Fallo al iniciar la sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @And("realizo el cierre de sesion")
    public void realizoElCierreDeSesion() {
        try {
            ACTOR.attemptsTo(
                    cierreSesion()
            );
            LOGGER.info("Se realiza el cierre de sesion");
        } catch (Exception e) {
            LOGGER.info("Fallo el cierre de sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();

        }
    }

    @Then("deberia volver al menu de inicio de sesion")
    public void deberiaVolverAlMenuDeInicioDeSesion() {
        try {
            ACTOR.should(
                    seeThat(mensajeLogout(), containsString("LOGIN"))
            );
            LOGGER.info("Hace la comparacion");
        } catch (Exception e) {
            LOGGER.info("Fallo la comparacion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
}

