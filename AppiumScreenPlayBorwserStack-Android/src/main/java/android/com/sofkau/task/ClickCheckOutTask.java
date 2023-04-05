package android.com.sofkau.task;

import android.com.sofkau.driver.AndroidDriverr;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.com.sofkau.ui.FlujoDeCompraUI.BOTON_CHECKOUT;

public class ClickCheckOutTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        AndroidDriverr.driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().text(\"CHECKOUT\"))"));
        actor.attemptsTo(
                Click.on(BOTON_CHECKOUT)
        );
    }
    public static ClickCheckOutTask clickCheckOutTask() {return new ClickCheckOutTask();}
}