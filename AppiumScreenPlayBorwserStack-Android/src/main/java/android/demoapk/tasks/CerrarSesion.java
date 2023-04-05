package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.ui.Menu.LOGOUT_BUTTON;
import static android.demoapk.ui.ProductsScreen.DISPLAY_OPTIONS_MENU;

public class CerrarSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DISPLAY_OPTIONS_MENU),
                Click.on(LOGOUT_BUTTON)
        );
    }

    public static CerrarSesion cerrarSesion(){
        return new CerrarSesion();
    }
}
