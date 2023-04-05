package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static android.demoapk.ui.RegistroUsuarioPagoLoca.*;


public class RegistroDatosUsuarioPago implements Task {
    private String name;
    private String lastName;
    private String zipCode;

    public RegistroDatosUsuarioPago conName(String name) {
        this.name = name;
        return this;
    }

    public RegistroDatosUsuarioPago conLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public RegistroDatosUsuarioPago yZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("Nevardo").into(NOMBRE_USUARIO_PAGO),
                Enter.theValue("Ospina").into(APELLIDO_USUARIO_PAGO),
                Enter.theValue("23454").into(CODE_POSTAL),
                Click.on(BUTTON_CONTINUE)
        );
    }

    public static RegistroDatosUsuarioPago registrarCompra() {return new RegistroDatosUsuarioPago();}
}
