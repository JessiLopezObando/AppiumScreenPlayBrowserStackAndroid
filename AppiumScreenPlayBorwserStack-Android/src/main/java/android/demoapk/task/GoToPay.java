package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.ui.CartView.CHECKOUT_BUTTON;
import static android.demoapk.ui.ProductsView.CART_BUTTON;

public class GoToPay implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKOUT_BUTTON)
        );
    }
    public static GoToPay goToPay(){
        return new GoToPay();
    }
}
