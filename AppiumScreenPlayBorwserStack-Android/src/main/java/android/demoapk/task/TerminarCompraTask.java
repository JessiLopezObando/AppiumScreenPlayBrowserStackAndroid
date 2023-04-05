package android.demoapk.task;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.driver.AndroidDriverr.driver;
import static android.demoapk.ui.RegistroUsuarioPagoLoca.BOTTON_TERMINAR;

public class TerminarCompraTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        {

            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))"
                            + ".scrollIntoView(new UiSelector().description(\"test-FINISH\"))"));
            actor.attemptsTo(
                    Click.on(BOTTON_TERMINAR)

            );
        }

            }
            public static TerminarCompraTask terminarCompraTask () {
            return new TerminarCompraTask();}


    }