package android.demoapk.task;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.driver.AndroidDriverr.driver;
import static android.demoapk.ui.FlujoDeCompraUI.BOTON_CONTINUAR;
import static android.demoapk.ui.FlujoDeCompraUI.BOTON_FINISH;

public class ClickBotonContinuar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().text(\"CONTINUE\"))"));
        actor.attemptsTo(
                Click.on(BOTON_CONTINUAR)
        );
    }

    public static ClickBotonContinuar clickBotonContinuar() {return new ClickBotonContinuar();}
}