package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.Logout.LOGOUT;
import static android.demoapk.ui.Logout.MENU_LOGOUT;
import static android.demoapk.ui.PaginaCheckout.*;


public class Logout implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(MENU_LOGOUT),
                Click.on(LOGOUT)
        );
    }

    public static Logout logout() {return new Logout();}
}
