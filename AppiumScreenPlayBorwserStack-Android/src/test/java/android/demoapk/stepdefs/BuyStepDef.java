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

import static android.demoapk.questions.IsOrderDone.isOrderDone;
import static android.demoapk.tasks.FillInfo.fillInfo;
import static android.demoapk.tasks.GoToCart.goToCart;
import static android.demoapk.tasks.GoToCheckout.goToCheckout;
import static android.demoapk.tasks.Login.login;
import static android.demoapk.tasks.Pay.pay;
import static android.demoapk.tasks.SelectItem.selectItem;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class BuyStepDef {
    private final Logger log = LoggerFactory.getLogger(BuyStepDef.class);
    Actor actor = Actor.named("Swag Labs user");

    @Given("I logged in")
    public void iLoggedIn() {
        try {
            log.info("Init scenario");
            actor.can(BrowseTheWeb
                    .with(AndroidDriver.configureDriver().start()));
            actor.wasAbleTo(
                    login()
            );
        } catch (Exception e) {
            log.error("Wrong Setup provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }
    }

    @When("I select Sauce Labs Backpack")
    public void iSelectSauceLabsBackpack() {
        try {
            log.info("Buy backpack");
            actor.attemptsTo(
                    selectItem(),
                    goToCart(),
                    goToCheckout()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }
    }

    @And("I pay for it")
    public void iPayForIt() {
        try {
            log.info("Pay backpack");
            actor.attemptsTo(
                    fillInfo(),
                    pay()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }
    }

    @Then("I will see a message thanking for order")
    public void iWillSeeAMessageThankingForOrder() {
        try {
            actor.should(
                    seeThat("Thanks message",
                            isOrderDone(), equalTo("THANK YOU FOR YOU ORDER"))
            );
            log.info("Test passed");
        } catch (Exception e) {
            log.error("Test failed");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        } finally {
            log.info("Test completed");
        }
    }
}