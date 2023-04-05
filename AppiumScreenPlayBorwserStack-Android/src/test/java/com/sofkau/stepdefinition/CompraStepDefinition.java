package com.sofkau.stepdefinition;

import com.sofkau.setup.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import static com.sofkau.question.MensajeCompra.mensajeCompra;
import static com.sofkau.task.DatosDeCompra.datosDeCompra;
import static com.sofkau.task.EscogerProductos.escogerProductos;
import static com.sofkau.task.IniciarSesion.iniciarSesion;
import static com.sofkau.task.RealizarCompra.realizarCompra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class CompraStepDefinition extends AndroidDriver {
    private static Logger LOGGER = Logger.getLogger(CompraStepDefinition.class);

    @Given("que inicio en la aplicacion swaglabs")
    public void queInicioEnLaAplicacionSwaglabs() {
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

    @When("inicio sesion en la app con credenciales validas")
    public void inicioSesionEnLaAppConCredencialesValidas() {
        try {
            ACTOR.attemptsTo(
                    iniciarSesion().credenciales(System.getenv("MY_APP_USERNAME"), System.getenv("MY_APP_PASSWORD"))
            );
            LOGGER.info("Se inicia sesion");
        }catch (Exception e){
            LOGGER.info("Fallo al iniciar la sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("agrego un producto al carrito y realizo la compra")
    public void agregoUnProductoAlCarritoYRealizoLaCompra() {
        try {
            ACTOR.attemptsTo(
                    escogerProductos(),
                    datosDeCompra("nombre", "apellido", "postal"),
                    realizarCompra().conElDriver(driver)
            );
            LOGGER.info("Se realiza una compra");
        } catch (Exception e) {
            LOGGER.info("Fallo el realizar la compra");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();

        }
    }
    @Then("deberia ver un mensaje de compra exitosa")
    public void deberiaVerUnMensajeDeCompraExitosa() {
        try {
            ACTOR.should(
                    seeThat(mensajeCompra(), containsString("THANK YOU FOR YOU ORDER"))
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
