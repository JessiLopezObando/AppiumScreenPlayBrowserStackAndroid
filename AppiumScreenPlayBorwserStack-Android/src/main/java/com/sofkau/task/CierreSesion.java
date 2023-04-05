package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.sofkau.ui.LogoutOverview.*;

public class CierreSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU),
                Click.on(LOGOUT)
        );
    }
    public static CierreSesion cierreSesion () {
        return new CierreSesion();
    }
}

