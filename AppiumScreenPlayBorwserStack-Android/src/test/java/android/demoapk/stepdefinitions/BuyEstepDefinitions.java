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

public class BuyEstepDefinitions {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(BuyEstepDefinitions.class));
    protected Actor actor = Actor.named("Yoli");
    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() throws MalformedURLException {


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

    @When("User introduce the valid credentials standard_user secret_sauce")
    public void userIntroduceTheValidCredentialsStandardUserSecretSauce() {
        try {

            actor.attemptsTo(
                    iniciarSesionTask ()
                            .conUser("standard_user")
                            .yPass("secret_sauce")
            );


        } catch (Exception e) {
            LOGGER.info(" Fallo al ingresar user y pass");
            LOGGER.warning(e.getMessage());
            Assertions.fail(e.getMessage());

        }
    }

    @When("User selects the product")
    public void userSelectsTheProduct() {
        try {

            actor.attemptsTo(
                    selecionaProductoTask()

            );
            LOGGER.info("Productos seleccionados con éxito");
            actor.attemptsTo(
                    registrarCompra()
                            .conName("Yoli")
                            .conLastName("Guadir")
                            .yZipCode("2389")
            );
            LOGGER.info("Registro de compra con éxito");
            actor.attemptsTo(
                    finalizarCompraTask()
            );
            LOGGER.info("Proceso de compra finalizado");

        } catch (Exception e) {
            LOGGER.info(" Fallo al realizar proceso de compra");
            LOGGER.warning(e.getMessage());
            Assertions.fail(e.getMessage());

        }
    }
    @Then("User should see payment information")
    public void userShouldSeePaymentInformation() {
        try {
            actor.should(
                    seeThat(Msj_Compra.isEqualTo(), containsString(String.format("THANK YOU FOR YOU ORDER")))
            );

            LOGGER.info("Prueba realizada con exito ");

        } catch (Exception e) {
            LOGGER.info("Assertions fallida");
            LOGGER.warning(e.getMessage());
            Assertions.fail(e.getMessage());

        }
    }
}
