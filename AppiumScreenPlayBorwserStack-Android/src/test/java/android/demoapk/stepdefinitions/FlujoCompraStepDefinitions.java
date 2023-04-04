package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import android.demoapk.questions.CheckoutCompleteMessage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import static android.demoapk.task.AddProduct.addProduct;
import static android.demoapk.task.CompleteCheckoutInfo.completeCheckoutInfo;
import static android.demoapk.task.FinishPurchase.finishPurchase;
import static android.demoapk.task.GoToCart.goToCart;
import static android.demoapk.task.GoToPay.goToPay;
import static android.demoapk.task.IniciarSesion.iniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class FlujoCompraStepDefinitions {
    protected Actor actor = Actor.named("User");
    @Given("Given que estoy logueado en la app con credenciales correctas")
    public void givenQueEstoyLogueadoEnLaAppConCredencialesCorrectas() {
        try {
            actor.can(BrowseTheWeb.with(AndroidDriverr.configureDriver().start()));
            actor.attemptsTo(
                    iniciarSesion().conUser("standard_user")
                            .conPass("secret_sauce")
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @When("he agregado el producto que quiero comprar")
    public void heAgregadoElProductoQueQuieroComprar() {
        try {
            actor.attemptsTo(
                    addProduct()
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
    @When("ingreso al carrito a finalizar compra")
    public void todosLosDatosDeEnvioYPago() {
//        try {
//            actor.attemptsTo(
//                    goToCart(),
//                    goToPay(),
//                    completeCheckoutInfo().withFirst("Juan")
//                            .withLast("Velez")
//                            .withZip("992"),
//                    finishPurchase()
//            );
//        }catch (Exception e){
//            Assertions.fail(e.getMessage());
//        }
    }
    @Then("se muestra el mensaje de orden finalizada")
    public void seMuestraElMensajeDeOrdenFinalizada() {
//        try {
//            actor.should(
//                    seeThat(CheckoutCompleteMessage.isEqualTo(), containsString(String.valueOf("THANK YOU FOR YOU ORDER")))
//            );
//        }catch (Exception e){
//            Assertions.fail(e.getMessage());
//        }
    }
}
