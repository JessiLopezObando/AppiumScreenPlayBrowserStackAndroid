package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import android.demoapk.question.Msj_Compra;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import static android.demoapk.task.FinalizarCompraTask.finalizarCompraTask;
import static android.demoapk.task.IniciarSesionTask.iniciarSesionTask;
import static android.demoapk.task.RegistrarCompra.registrarCompra;
import static android.demoapk.task.SelecionaProductoTask.selecionaProductoTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LogoutEstepDefinitions {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LogoutEstepDefinitions.class));
    protected Actor actor = Actor.named("Yoli");
    @Given("El usuario esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio() {
        try {

            actor.can(BrowseTheWeb.
                    with(AndroidDriverr.configureDriver().start()));
            LOGGER.info("Inicio de automatización con exito");


        } catch (Exception e) {
            LOGGER.info(" Fallo al abrir app");
            LOGGER.warning(e.getMessage());
            Assertions.fail(e.getMessage());

        }
    }
    @Given("envia datos para  iniciar sesion {string} y {string}")
    public void enviaDatosParaIniciarSesionY(String user, String pass) {
        try {

            actor.attemptsTo(
                    iniciarSesionTask ()
                            .conUser(user)
                            .yPass(pass)
            );


        } catch (Exception e) {
            LOGGER.info(" Fallo al ingresar user y pass");
            LOGGER.warning(e.getMessage());
            Assertions.fail(e.getMessage());

        }
    }
    @When("Usuario cierra sesion")
    public void usuarioCierraSesion() {

    }
    @Then("Usuario vuelve al inicio sesion")
    public void usuarioVuelveAlInicioSesion() {

    }

}
