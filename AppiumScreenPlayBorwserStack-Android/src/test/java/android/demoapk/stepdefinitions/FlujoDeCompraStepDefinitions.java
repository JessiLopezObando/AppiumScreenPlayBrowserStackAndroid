package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;

import static android.demoapk.task.AgregarAlCarritoTask.agregarAlCarritoTask;
import static android.demoapk.task.ClickBotonContinuar.clickBotonContinuar;
import static android.demoapk.task.ClickCheckOutTask.clickCheckOutTask;
import static android.demoapk.task.IniciarSesionTask.iniciarSesionTask;
import static android.demoapk.task.LlenarFormularioTask.llenarFormularioTask;
import static android.demoapk.task.PagoTask.pagoTask;
import static android.demoapk.task.SeleccionarProductosTask.seleccionarProductosTask;
import static android.demoapk.ui.FlujoDeCompraUI.MENSAJE_ASERCION;
import static android.demoapk.ui.FlujoDeCompraUI.OBJETO_ASERCION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.assertj.core.api.Assertions.assertThat;

public class FlujoDeCompraStepDefinitions {
    private final Logger log = LoggerFactory.getLogger(FlujoDeCompraStepDefinitions.class);
    Actor actor = Actor.named("Bryan");
    @Given("Que el usuario ingresa a la aplicacion de compras del telefono android")
    public void queElUsuarioIngresaALaAplicacionDeComprasDelTelefonoAndroid() throws MalformedURLException {
        try {
            log.info("Inicio de la automatizacion");
            actor.can(BrowseTheWeb
                    .with(AndroidDriverr.configureDriver().start()));

        } catch (Exception e) {
            log.error("Configuracion incorrecta");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }
    }

    @When("Introduce sus credenciales validas de usuario {string} y contrasenna {string}")
    public void introduceSusCredencialesValidasDeUsuarioYContrasenna(String string, String string2) {
        try{
            log.info("Se Inicia Sesion con credenciales validas");
            actor.attemptsTo(
                    iniciarSesionTask()
            );
        } catch (Exception e) {
            log.error("Problema con el inicio de sesion");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }
    }
    @When("Selecciona los productos que desea comprar y hace la compra")
    public void seleccionaLosProductosQueDeseaComprarYHaceLaCompra() {
        try {
            log.info("Seleccionar productos y comprarlos");
            actor.attemptsTo(
                    seleccionarProductosTask(),
                    agregarAlCarritoTask(),
                    clickCheckOutTask(),
                    llenarFormularioTask().nombre("Bryan").apellido("Polo").zipCode("051040"),
                    clickBotonContinuar(),
                    pagoTask()
            );
        } catch (Exception e) {
            log.error("Problema al agregar o comprar productos");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }
    }
    @Then("deberia ver la pagina de confirmacion de compra con un mensaje indicando que su compra se realizo con exito.")
    public void deberiaVerLaPaginaDeConfirmacionDeCompraConUnMensajeIndicandoQueSuCompraSeRealizoConExito() {
        try {
            actor.should(
                    seeThat(the(MENSAJE_ASERCION), isVisible())
            );
            actor.should(
                    seeThat(the(OBJETO_ASERCION), isVisible())
            );
            String expectedMessage = "THANK YOU FOR YOU ORDER";
            String actualMessage = MENSAJE_ASERCION.resolveFor(actor).getText();
            assertThat(actualMessage).isEqualTo(expectedMessage);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
