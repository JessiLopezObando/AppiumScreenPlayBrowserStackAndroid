package android.demoapk.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static android.demoapk.ui.CheckoutOverviewScreen.COMPLETE_ORDER_MESSAGE;

public class MensajeCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return COMPLETE_ORDER_MESSAGE.resolveFor(actor).getText();
    }

    public static MensajeCompra mensajeCompra(){
        return new MensajeCompra();
    }
}
