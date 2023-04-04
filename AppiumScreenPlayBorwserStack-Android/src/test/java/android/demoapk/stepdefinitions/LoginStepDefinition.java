package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import java.net.MalformedURLException;

import static android.demoapk.driver.AndroidDriverr.driver;
import static android.demoapk.task.AddProduct.addProduct;
import static android.demoapk.task.IniciarSesion.iniciarSesion;

public class LoginStepDefinition {

    protected Actor actor = Actor.named("User");
    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes()  {
        try {
            actor.can(BrowseTheWeb.with(AndroidDriverr.configureDriver().start()));
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }

    }
    @When("User introduce the valid credentials standard_user secret_sauce")
    public void userIntroduceTheValidCredentialsStandardUserSecretSauce() {
        try {
            actor.attemptsTo(
                    iniciarSesion().conUser("standard_user")
                            .conPass("secret_sauce"),
                    addProduct()
            );
        }catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }

    @Then("User should see the Products list")
    public void userShouldSeeTheProductsList() {

    }

}
