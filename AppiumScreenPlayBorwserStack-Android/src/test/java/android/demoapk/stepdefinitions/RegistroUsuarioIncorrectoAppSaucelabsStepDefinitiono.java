package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import android.demoapk.question.MensajeConfirmacionInicioSesionInvalidai;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import java.net.MalformedURLException;

import static android.demoapk.task.LoginUsuarioTask.loginUsuarioTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;

public class RegistroUsuarioIncorrectoAppSaucelabsStepDefinitiono {
    public static Logger LOGGER = Logger.getLogger(CierreSesionAppSaucelabsStepDefinition.class);
    protected Actor actor = Actor.named("Usuario de la app");


    @Given("el usuario se encuentra en la pagina de incio")
    public void el_usuario_se_encuentra_en_la_pagina_de_incio() {
        try {
            actor.can(BrowseTheWeb.with(AndroidDriverr.configureDriver().start()));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @When("el usuario introduce las credenciales invalida usuario {string} contrasenia {string}")
    public void el_usuario_introduce_las_credenciales_invalida_usuario_contrasenia(String usuario, String contrasenia) {
        try {
            actor.attemptsTo(loginUsuarioTask().conUsuario(usuario).conPassword(contrasenia));

            LOGGER.info("El ingreso fue invalido  ");

        } catch (Exception e) {
            LOGGER.info("Fallo al realizar el registro en la app");
            LOGGER.info(e.getMessage());
            Assertions.fail(e.getMessage());
        }
    }
    @Then("el usuario debe ver un mensaje compra exitosa")
    public void el_usuario_debe_ver_un_mensaje_compra_exitosa() {
        try {
            actor.should(
                    seeThat(MensajeConfirmacionInicioSesionInvalidai.isEqualTo(), containsString(String.format("Username and password do not match any user in this service."))));
            LOGGER.info("Usuario o contraseña no valida ");
        } catch (Exception e) {
            LOGGER.info("Fallo al realizar la assercion");
            Assertions.fail(e.getMessage());
        }
    }

}
