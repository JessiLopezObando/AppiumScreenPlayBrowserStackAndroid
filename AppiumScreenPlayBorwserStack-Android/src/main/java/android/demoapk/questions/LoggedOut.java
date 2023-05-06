package android.demoapk.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static android.demoapk.ui.LoginScreen.LOGIN_TEXT;

public class LoggedOut implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LOGIN_TEXT.resolveFor(actor).getText();
    }

    public static LoggedOut loggedOut() {
        return new LoggedOut();
    }
}