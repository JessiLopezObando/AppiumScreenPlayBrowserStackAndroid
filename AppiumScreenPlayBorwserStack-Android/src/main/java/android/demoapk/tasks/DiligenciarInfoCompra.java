package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.CheckoutScreen.*;
import static android.demoapk.util.Constants.*;


public class DiligenciarInfoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(FIRST_NAME).into(FIRST_NAME_BOX),
                Enter.theValue(LAST_NAME).into(LAST_NAME_BOX),
                Enter.theValue(ZIP_CODE).into(ZIP_CODE_BOX),
                Click.on(CONTINUE_BUTTON)
        );
    }

    public static DiligenciarInfoCompra diligenciarInfoCompra(){
        return new DiligenciarInfoCompra();
    }
}
