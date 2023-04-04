package android.demoapk.stepdefinitions;

import android.demoapk.driver.AndroidDriverr;
import android.demoapk.setup.Configuracion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;


public class LoginStepDefinition extends Configuracion {

    public static Logger LOGGER = Logger.getLogger(LoginStepDefinition.class);

    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() {
        try {
            setUplog4j();
            actor.can(BrowseTheWeb.with(AndroidDriverr.configureDriver().start()));
        } catch (Exception e){
            LOGGER.info("Fallo en la configuracion inicial");
            LOGGER.warn(e.getMessage());
            Assertions.fail(e.getMessage());
        }
    }
    @When("User introduce the valid credentials standard_user secret_sauce")
    public void userIntroduceTheValidCredentialsStandardUserSecretSauce() {

    }
    @Then("User should see the Products list")
    public void userShouldSeeTheProductsList() {

    }

    protected Actor actor = Actor.named("User");
    @Managed(driver = "Appium")
    protected WebDriver theMobileDevice;
}
