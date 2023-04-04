package android.demoapk.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;

import static android.demoapk.ui.LoginScreen.BIO_BTTN;

public class LoggedOut implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BIO_BTTN.resolveFor(actor).getText();
    }

    public static LoggedOut loggedOut() {
        return new LoggedOut();
    }
}