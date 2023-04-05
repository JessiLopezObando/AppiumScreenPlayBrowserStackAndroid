package android.demoapk.tasks;

import static android.demoapk.driver.AndroidDriverr.driver;
import static android.demoapk.ui.CheckoutOverviewScreen.FINISH_BUTTON;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class FinalizarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().description(\"test-FINISH\"))"));

        actor.attemptsTo(
                Click.on(FINISH_BUTTON)
        );
    }

    public static FinalizarCompra finalizarCompra(){
        return new FinalizarCompra();
    }
}
