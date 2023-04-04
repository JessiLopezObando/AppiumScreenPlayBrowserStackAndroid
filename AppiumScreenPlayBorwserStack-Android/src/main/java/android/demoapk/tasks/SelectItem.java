package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.ui.BuyScreen.ADD_BTTN;

public class SelectItem implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_BTTN)
        );
    }

    public static SelectItem selectItem() {
        return new SelectItem();
    }
}