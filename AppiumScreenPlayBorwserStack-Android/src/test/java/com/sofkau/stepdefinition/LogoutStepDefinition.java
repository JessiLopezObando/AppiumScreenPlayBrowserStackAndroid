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

import static com.sofkau.task.IniciarSesion.iniciarSesion;

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
            LOGGER.info("Fallo el entrar en la opcion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();

        }
    }

    @When("realizamos el cierre de sesion")
    public void realizamosElCierreDeSesion() {
    }

    @Then("volvemos al menu de inicio de sesion")
    public void volvemosAlMenuDeInicioDeSesion() {
    }
}
