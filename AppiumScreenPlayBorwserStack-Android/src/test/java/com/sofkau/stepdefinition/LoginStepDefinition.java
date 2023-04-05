package com.sofkau.stepdefinition;

import com.sofkau.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import static com.sofkau.question.MensajeInicio.mensajeInicio;
import static com.sofkau.task.IniciarSesion.iniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepDefinition extends AndroidDriver {

    private static Logger LOGGER = Logger.getLogger(LoginStepDefinition.class);

    Actor ACTOR = Actor.named("James");

    @Given("que accedemos a la aplicacion swaglabs")
    public void queAccedemosALaAplicacionSwaglabs() {
        try {
            ACTOR.can(BrowseTheWeb.with(AndroidDriver.configureDriver().start()));
            LOGGER.info("Inicia la automatizacion");
        } catch (Exception e) {
            LOGGER.info("Fallo la configuracion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        }
    }

    @When("Ingresamos los datos de usuario y contraseña")
    public void ingresamosLosDatosDeUsuarioYContraseña() {
        try {
            ACTOR.attemptsTo(
                    iniciarSesion().credenciales("standard_user", "secret_sauce")
            );
            LOGGER.info("Se inicia sesion");
        } catch (Exception e) {
            LOGGER.info("Fallo el entrar en la opcion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();

        }
    }

    @Then("obtemos un mensaje de inicio de sesion exitoso")
    public void obtemosUnMensajeDeInicioDeSesionExitoso() {
        try {
            ACTOR.should(
                    seeThat(mensajeInicio(), containsString("PRODUCTS"))
            );
            LOGGER.info("Hace la comparacion");
        } catch (Exception e) {
            LOGGER.info("Fallo la comparacion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        } finally {

        }
    }
}
