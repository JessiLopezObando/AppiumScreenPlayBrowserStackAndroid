package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static android.demoapk.task.CerrarSesionTask.cerrarSesionTask;
import static android.demoapk.task.IniciarSesionTask.iniciarSesionTask;
import static android.demoapk.ui.CerrarSesionUI.LOGO_ASERCION;
import static android.demoapk.ui.CerrarSesionUI.MENSAJE_ASERCION_CERRAR_SESION;
import static android.demoapk.ui.FlujoDeCompraUI.MENSAJE_ASERCION;
import static android.demoapk.ui.FlujoDeCompraUI.OBJETO_ASERCION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.assertj.core.api.Assertions.assertThat;

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
                    cerrarSesionTask()
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
                    seeThat(the(MENSAJE_ASERCION_CERRAR_SESION), isVisible())
            );
            actor.should(
                    seeThat(the(LOGO_ASERCION), isVisible())
            );
            String expectedMessage = "The currently accepted usernames for this application are (tap to autofill):";
            String actualMessage = MENSAJE_ASERCION.resolveFor(actor).getText();
            assertThat(actualMessage).isEqualTo(expectedMessage);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
