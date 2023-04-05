package com.sofkau.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CompraOverview.*;

public class EscogerProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ORDENAR),
                Click.on(ANADIR),
                Click.on(CARRITO),
                Click.on(CHECKOUT)
        );
    }
    public static EscogerProductos escogerProductos() {
        return new EscogerProductos();
    }
}
