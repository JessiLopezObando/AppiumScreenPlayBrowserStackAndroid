package android.com.sofkau.task;

import android.com.sofkau.driver.AndroidDriverr;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.com.sofkau.ui.FlujoDeCompraUI.BOTON_FINISH;

public class PagoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        AndroidDriverr.driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().text(\"FINISH\"))"));
        actor.attemptsTo(
                Click.on(BOTON_FINISH)
        );
    }

    public static PagoTask pagoTask() {return new PagoTask();}
}