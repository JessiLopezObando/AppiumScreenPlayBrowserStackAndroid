package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.LogoutOverview.ASERCION_LOGIN;

public class MensajeLogout implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return ASERCION_LOGIN.resolveFor(actor).getText();
    }
    public static MensajeLogout mensajeLogout() {
        return new MensajeLogout();
    }
}