package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.LoginView.*;
import static android.demoapk.ui.ProductsView.CART_BUTTON;

public class GoToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CART_BUTTON)
        );
    }
    public static GoToCart goToCart(){
        return new GoToCart();
    }
}
