package com.sofkau.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.LoginOverview.PRODUCTOS;

public class MensajeInicio implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PRODUCTOS.resolveFor(actor).getText();
    }
    public static MensajeInicio mensajeInicio() {
        return new MensajeInicio();
    }
}