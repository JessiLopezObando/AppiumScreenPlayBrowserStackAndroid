package android.demoapk.stepdefinitions;


import android.demoapk.driver.AndroidDriverr;
import android.demoapk.question.MensajeConfirmacionCompra;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import java.net.MalformedURLException;

import static android.demoapk.task.ElegirArticuloTask.selecionaProductoTask;
import static android.demoapk.task.LoginUsuarioTask.loginUsuarioTask;
import static android.demoapk.task.RegistroDatosUsuarioPago.registrarCompra;
import static android.demoapk.task.TerminarCompraTask.terminarCompraTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;

public class AppSaucelabsStepDefinition {
    public static Logger LOGGER = Logger.getLogger(AppSaucelabsStepDefinition.class);
    protected Actor actor = Actor.named("Usuario de la app");

    @Given("El usuario quiere comprar vestuarios")
    public void elUsuarioQuiereComprarVestuarios() {

        try {
            actor.can(BrowseTheWeb.with(AndroidDriverr.configureDriver().start()));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @When("El usuario introduce las credenciales standard_user secret_sauce")
    public void el_usuario_introduce_las_credenciales_standard_user_secret_sauce() {

        try {
            actor.attemptsTo(loginUsuarioTask().conUsuario("standard_user").conPassword("secret_sauce"));

            LOGGER.info("El usuario fue registrado con exito ");

        } catch (Exception e) {
            LOGGER.info("Fallo al realizar el registro en la app");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }

        try {
            actor.attemptsTo(selecionaProductoTask());
        } catch (Exception e) {
            LOGGER.info("Fallo al realizar al selecionar el producto ");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }
        try {
            actor.attemptsTo(registrarCompra());
        } catch (Exception e) {
            LOGGER.info("Fallo al realizar el registro del usuario de quien realiza el pago en la app");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }

        try {
            actor.attemptsTo(terminarCompraTask());
        } catch (Exception e) {
            LOGGER.info("Fallo al finalizar la compra en la app");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }

    }

    @Then("El usuario debe ver la lista de productos")
    public void elUsuarioDebeVerLaListaDeProductos() {
        try {
            actor.should(
                    seeThat(MensajeConfirmacionCompra.isEqualTo(), containsString(String.format("THANK YOU FOR YOU ORDER"))));
            LOGGER.info("El flujo de compra fue exito ");
        } catch (Exception e) {
            LOGGER.info("Fallo al realizar la assercion");
           Assertions.fail(e.getMessage());
        }
        }
    }
