package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.ui.CartScreen.CHECKOUT_BTTN;

public class GoToCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKOUT_BTTN)
        );
    }

    public static GoToCheckout goToCheckout() {
        return new GoToCheckout();
    }
}