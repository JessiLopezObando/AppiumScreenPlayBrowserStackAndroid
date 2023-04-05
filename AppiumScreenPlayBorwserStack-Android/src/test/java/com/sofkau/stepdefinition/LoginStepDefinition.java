package com.sofkau.stepdefinition;

import com.sofkau.setup.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import static com.sofkau.question.MensajeInicio.mensajeInicio;
import static com.sofkau.task.IniciarSesion.iniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepDefinition extends AndroidDriver {
    private static final Logger LOGGER = Logger.getLogger(LoginStepDefinition.class);
    private final String username = System.getenv("MY_APP_USERNAME");
    private final String password = System.getenv("MY_APP_PASSWORD");

    @Given("que accedo a la aplicacion swaglabs")
    public void queAccedoALaAplicacionSwaglabs() {
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
    @When("Ingreso los datos de usuario y contraseña")
    public void ingresoLosDatosDeUsuarioYContrasena()  {
        try {
            ACTOR.attemptsTo(
                    iniciarSesion().credenciales(username,password)
            );
            LOGGER.info("Se inicia sesion");
        } catch (Exception e) {
            LOGGER.info("Fallo el entrar en la opcion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @Then("el inicio de sesion se deberia realizar correctamente")
    public void elInicioDeSesionSeDeberiaRealizarCorrectamente() {
        try {
            ACTOR.should(
                    seeThat(mensajeInicio(), containsString("PRODUCTS"))
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
