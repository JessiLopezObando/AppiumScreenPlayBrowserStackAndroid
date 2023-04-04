package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.Login.*;
import static android.demoapk.ui.PaginaCheckout.*;


public class RegistrarCompra implements Task {
    private String name;
    private String lastName;
    private String zipCode;

    public RegistrarCompra conName(String name) {
        this.name = name;
        return this;
    }

    public RegistrarCompra conLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public RegistrarCompra yZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(BUTTON_CHECKOUT),
                Enter.theValue(name).into(INPUT_NAME),
                Enter.theValue(lastName).into(INPUT_LAST_NAME),
                Enter.theValue(zipCode).into(INPUT_ZIP_CODE),
                Click.on(BUTTON_CONTINUE)
        );
    }

    public static RegistrarCompra registrarCompra() {return new RegistrarCompra();}
}
