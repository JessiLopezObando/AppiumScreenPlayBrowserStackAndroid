package android.demoapk.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static android.demoapk.ui.LoginScreen.LOGIN_MESSAGE;

public class MensajePantallaInicio implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LOGIN_MESSAGE.resolveFor(actor).getText();

    }

    public static MensajePantallaInicio mensajePantallaInicio(){
        return new MensajePantallaInicio();
    }
}
