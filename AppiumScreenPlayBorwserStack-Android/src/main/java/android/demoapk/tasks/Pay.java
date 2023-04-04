package android.demoapk.tasks;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.driver.AndroidDriver.driver;
import static android.demoapk.ui.CheckoutOverviewScreen.FINISH_BTTN;

public class Pay implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().description(\"test-FINISH\"))"));
        actor.attemptsTo(
                Click.on(FINISH_BTTN)
        );
    }

    public static Pay pay() {
        return new Pay();
    }
}