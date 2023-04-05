package com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.sofkau.ui.CompraOverview.*;


public class DatosDeCompra implements Task {
    private String nombre;
    private String apellido;
    private String postal;
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(nombre).into(NOMBRE),
                Enter.theValue(apellido).into(APELLIDO),
                Enter.theValue(postal).into(POSTAL),
                Click.on(CONTINUAR)
        );
    }

    public static DatosDeCompra datosDeCompra(String nombre, String apellido, String postal) {
        return new DatosDeCompra(nombre, apellido, postal);
    }
    public DatosDeCompra (String nombre, String apellido, String postal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.postal = postal;
    }
}