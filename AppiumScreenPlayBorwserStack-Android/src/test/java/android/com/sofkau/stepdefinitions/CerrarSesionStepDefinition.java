package android.com.sofkau.stepdefinitions;

import android.com.sofkau.driver.AndroidDriverr;
import android.com.sofkau.question.CerrarSesionQuestion;
import android.com.sofkau.task.CerrarSesionTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static android.com.sofkau.task.IniciarSesionTask.iniciarSesionTask;
import static org.hamcrest.Matchers.containsString;



public class CerrarSesionStepDefinition {
    private final Logger log = LoggerFactory.getLogger(CerrarSesionStepDefinition.class);
    Actor actor = Actor.named("Bryan");

    @Given("que inicie sesion en la app de compras")
    public void queInicieSesionEnLaAppDeCompras() {
        try {
            log.info("Inicio de la automatizacion");
            actor.can(BrowseTheWeb
                    .with(AndroidDriverr.configureDriver().start()));
            actor.attemptsTo(
                    iniciarSesionTask()
            );

        } catch (Exception e) {
            log.error("Configuracion incorrecta");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }
    }
    @When("voy a cerrar sesion en la app de compras")
    public void voyACerrarSesionEnLaAppDeCompras() {
        try {
            log.info("Cerrar Sesion");
            actor.attemptsTo(
                    CerrarSesionTask.cerrarSesionTask()
            );
        } catch (Exception e) {
            log.error("problema al tratar de cerrar sesion");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }

    }
    @Then("la app me deberia redireccionar nuevamente a la pantalla de inicio de sesion")
    public void laAppMeDeberiaRedireccionarNuevamenteALaPantallaDeInicioDeSesion() {

        try {
            actor.should(
                    GivenWhenThen.seeThat(CerrarSesionQuestion.isEqualTo(),containsString(String.format("The currently accepted usernames for this application are (tap to autofill):")))
            );
            log.info("Se verifico la comparacion del texto");

        } catch (Exception e) {
            log.error("Error en las aserciones");
            log.error(e.getMessage());
            throw e;
        }

    }


}
