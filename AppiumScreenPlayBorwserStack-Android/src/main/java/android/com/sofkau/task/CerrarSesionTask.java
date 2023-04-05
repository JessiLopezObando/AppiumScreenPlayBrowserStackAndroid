package android.com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.com.sofkau.ui.CerrarSesionUI.BOTON_LOGOUT;
import static android.com.sofkau.ui.CerrarSesionUI.MENU;

public class CerrarSesionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MENU),
                Click.on(BOTON_LOGOUT)
        );
    }
    public static CerrarSesionTask cerrarSesionTask() {return new CerrarSesionTask();}

}