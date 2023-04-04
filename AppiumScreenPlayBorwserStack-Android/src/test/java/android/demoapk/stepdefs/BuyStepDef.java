package android.demoapk.stepdefs;

import android.demoapk.driver.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuyStepDef {
    private final Logger log = LoggerFactory.getLogger(BuyStepDef.class);

    @Given("I logged in")
    public void iLoggedIn() {
        try {
            log.info("Init scenario");
            Actor.named("Swag Labs user")
                    .can(BrowseTheWeb
                            .with(AndroidDriver.configureDriver().start()));
        } catch (Exception e) {
            log.error("Wrong Setup provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }
    }

    @When("I select Sauce Labs Backpack")
    public void iSelectSauceLabsBackpack() {
    }

    @And("I pay for it")
    public void iPayForIt() {
    }

    @Then("I will see a message thanking for order")
    public void iWillSeeAMessageThankingForOrder() {
    }
}