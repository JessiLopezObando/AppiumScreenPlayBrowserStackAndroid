package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.Login.*;


public class IniciarSesionTask implements Task {
    private String user;
    private String pass;

    public IniciarSesionTask conUser(String user) {
        this.user = user;
        return this;
    }

    public IniciarSesionTask yPass(String pass) {
        this.pass = pass;
        return this;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(user).into(INPUT_USER),
                Enter.theValue(pass).into(INPUT_PASS),
                Click.on(BUTTON_LOGIN)
        );
    }

    public static IniciarSesionTask iniciarSesionTask() {return new IniciarSesionTask();}
}
