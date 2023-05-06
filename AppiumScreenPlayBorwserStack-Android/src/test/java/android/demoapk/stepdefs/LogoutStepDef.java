package android.demoapk.stepdefs;

import android.demoapk.driver.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static android.demoapk.questions.LoggedOut.loggedOut;
import static android.demoapk.tasks.Login.login;
import static android.demoapk.tasks.Logout.logout;
import static android.demoapk.tasks.OpenMenu.openMenu;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.*;

public class LogoutStepDef {
    private final Logger log = LoggerFactory.getLogger(LogoutStepDef.class);
    Actor actor = Actor.named("Swag Labs user");

    @Given("I logged in to the app")
    public void iLoggedInToTheApp() {
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

    @When("I am logging out")
    public void iAmLoggingOut() {
        try {
            log.info("Logout");
            actor.attemptsTo(
                    openMenu(),
                    logout()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
        }
    }

    @Then("I will see the login screen")
    public void iWillSeeTheLoginScreen() {
        try {
            actor.should(
                    seeThat("Login screen",
                            loggedOut(), containsString("The currently accepted"))
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