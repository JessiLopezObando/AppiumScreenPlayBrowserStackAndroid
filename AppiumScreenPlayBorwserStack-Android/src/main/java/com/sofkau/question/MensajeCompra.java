package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.CompraOverview.THANKS;

public class MensajeCompra implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return THANKS.resolveFor(actor).getText();
    }
    public static MensajeCompra mensajeCompra() {
        return new MensajeCompra();
    }
}