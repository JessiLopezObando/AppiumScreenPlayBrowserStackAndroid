package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import android.demoapk.setup.Configuracion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static android.demoapk.questions.MensajePantallaInicio.mensajePantallaInicio;
import static android.demoapk.tasks.CerrarSesion.cerrarSesion;
import static android.demoapk.tasks.IniciarSesion.iniciarSesion;
import static android.demoapk.util.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LogoutStepDefinition extends Configuracion {

    public static Logger LOGGER = Logger.getLogger(LogoutStepDefinition.class);

    @Given("el usuario inicia sesion exitosamente en la app")
    public void elUsuarioIniciaSesionExitosamenteEnLaApp() {
        try {
            setUplog4j();
            actor.can(BrowseTheWeb.with(AndroidDriverr.configureDriver().start()));
            LOGGER.info("INICIO AUTOMATIZACION");
            actor.attemptsTo(
                    iniciarSesion()
                            .withTheUser(USER)
                            .andThePassword(PASSWORD)
            );
        } catch (Exception e){
            LOGGER.info("Fallo en el inicio de sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
        }
    }

    @When("el usuario solicita cerrar sesion")
    public void elUsuarioSolicitaCerrarSesion() {
        try {
            actor.attemptsTo(
                cerrarSesion()
            );
        } catch (Exception e){
            LOGGER.info("Fallo cerrando sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
        }
    }

    @Then("el usuario observa la pantalla de inicio de sesion")
    public void elUsuarioObservaLaPantallaDeInicioDeSesion() {
        try {
            actor.should(
                    seeThat(mensajePantallaInicio(), containsString(MENSAJE_PANTALLA_INICIO_SESION))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e){
            LOGGER.info("fallo en la comparacion de resultados");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
        }
    }

}
