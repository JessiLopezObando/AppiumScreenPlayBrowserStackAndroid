package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.ui.CartScreen.CHECKOUT_BUTTON;
import static android.demoapk.ui.ProductsScreen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import net.serenitybdd.screenplay.waits.WaitUntil;

public class ElegirProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ADD_TO_CART_BUTTON, isPresent()),
                WaitUntil.the(ADD_TO_CART_BUTTON, isCurrentlyVisible()),
                WaitUntil.the(ADD_TO_CART_BUTTON, isCurrentlyEnabled()),
                WaitUntil.the(ADD_TO_CART_BUTTON, isClickable()),
                Click.on(ADD_TO_CART_BUTTON),
                Click.on(CART_ICON),
                Click.on(CHECKOUT_BUTTON)
        );
    }

    public static ElegirProducto elegirProducto(){
        return new ElegirProducto();
    }
}
