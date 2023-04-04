package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollToTarget;

import static android.demoapk.ui.CheckoutOverviewScreen.FINISH_BTTN;

public class Pay implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FINISH_BTTN),
                Click.on(FINISH_BTTN)
        );
    }

    public static Pay pay() {
        return new Pay();
    }
}