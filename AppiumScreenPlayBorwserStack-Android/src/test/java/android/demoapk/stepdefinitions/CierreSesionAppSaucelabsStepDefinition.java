package android.demoapk.stepdefinitions;


import android.demoapk.driver.AndroidDriverr;
import android.demoapk.question.MensajeConfirmacionCierreSesion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import java.net.MalformedURLException;

import static android.demoapk.task.CierreSesionTask.cierreSesionTask;
import static android.demoapk.task.ElegirArticuloTask.selecionaProductoTask;
import static android.demoapk.task.LoginUsuarioTask.loginUsuarioTask;
import static android.demoapk.task.RegistroDatosUsuarioPago.registrarCompra;
import static android.demoapk.task.TerminarCompraTask.terminarCompraTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;

public class CierreSesionAppSaucelabsStepDefinition {
    public static Logger LOGGER = Logger.getLogger(CierreSesionAppSaucelabsStepDefinition.class);
    protected Actor actor = Actor.named("Usuario de la app");

    @Given("El usuario se encuentra en la pagina de incio")
    public void el_usuario_se_encuentra_en_la_pagina_de_incio() {
        try {
            actor.can(BrowseTheWeb.with(AndroidDriverr.configureDriver().start()));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @When("El usuario introduce las credenciales usuario {string} contrasenia {string}")
    public void el_usuario_introduce_las_credenciales_usuario_contrasenia(String usuario, String contrasenia) {
        try {
            actor.attemptsTo(loginUsuarioTask().conUsuario(usuario).conPassword(contrasenia));

            LOGGER.info("El usuario fue registrado con exito ");

        } catch (Exception e) {
            LOGGER.info("Fallo al realizar el registro en la app");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }

    }
    @When("realiza las compras de su interes y cierra sesion")
    public void realiza_las_compras_de_su_interes_y_cierra_sesion() {
        try {
            actor.attemptsTo(selecionaProductoTask());
            LOGGER.info("El usuario seleciona el producto exitosamente ");
        } catch (Exception e) {
            LOGGER.info("Fallo al realizar al selecionar el producto ");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }
        try {
            actor.attemptsTo(registrarCompra());
            LOGGER.info("El usuario registra los datos de la persona quien realizara el pago en la app ");
        } catch (Exception e) {
            LOGGER.info("Fallo al realizar el registro del usuario de quien realiza el pago en la app");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }

        try {
            actor.attemptsTo(terminarCompraTask());
            LOGGER.info("El usuario termina la compra exitosamente ");
        } catch (Exception e) {
            LOGGER.info("Fallo al finalizar la compra en la app");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }

        try {
            actor.attemptsTo(cierreSesionTask());
            LOGGER.info("El usuario cierra sesion exitosamente ");
        } catch (Exception e) {
            LOGGER.info("Fallo al cerrar la sesion en la app");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }


    }
    @Then("El usuario deberia volver al inicio de la app")
    public void el_usuario_deberia_volver_al_inicio_de_la_app() {
        try {
            actor.should(
                    seeThat(MensajeConfirmacionCierreSesion.isEqualTo(), containsString(String.format(""))));
            LOGGER.info("El flujo de compra fue exito ");
        } catch (Exception e) {
            LOGGER.info("Fallo al realizar la assercion");
            Assertions.fail(e.getMessage());
        }
    }
    }
