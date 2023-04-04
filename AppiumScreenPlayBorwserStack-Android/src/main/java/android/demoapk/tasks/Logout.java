package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.ui.BuyScreen.LOGOUT;

public class Logout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGOUT)
        );
    }

    public static Logout logout() {
        return new Logout();
    }
}