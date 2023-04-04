package android.demoapk.tasks;

import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.LoginScreen.*;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Dotenv dotenv = Dotenv.configure().load();
        String swaglabsUser = dotenv.get("SWAGLABS_USER");
        String swaglabsPassword = dotenv.get("SWAGLABS_PASSWORD");
        actor.attemptsTo(
                Enter.theValue(swaglabsUser).into(USERNAME),
                Enter.theValue(swaglabsPassword).into(PASSWORD),
                Click.on(LOGIN_BTTN)
        );
    }

    public static Login login() {
        return new Login();
    }
}