package android.demoapk.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static android.demoapk.ui.ProductsScreen.PRODUCTS_MESSAGE;

public class MensajeLogin implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PRODUCTS_MESSAGE.resolveFor(actor).getText();
    }

    public static MensajeLogin mensajeLogin(){
        return new MensajeLogin();
    }
}
