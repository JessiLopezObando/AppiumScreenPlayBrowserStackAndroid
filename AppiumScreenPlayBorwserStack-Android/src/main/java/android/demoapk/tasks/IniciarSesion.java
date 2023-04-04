package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.LoginScreen.*;

public class IniciarSesion implements Task {

    private String user;
    private String password;

    public IniciarSesion withTheUser(String user){
        this.user = user;
        return this;
    }

    public IniciarSesion andThePassword(String password){
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              Enter.theValue(user).into(USER_NAME),
              Enter.theValue(password).into(PASSWORD),
              Click.on(LOGIN_BUTTON)
      );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
