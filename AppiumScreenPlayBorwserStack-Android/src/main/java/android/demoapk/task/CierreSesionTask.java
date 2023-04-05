package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.ui.CierreSesion.*;
import static android.demoapk.ui.ElegirProductoLocal.*;


public class CierreSesionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BOTON_BACK_HOME),
                Click.on(MENU),
                Click.on(LOGOUT)

        );
    }

    public static CierreSesionTask cierreSesionTask() {return new CierreSesionTask();}

}
