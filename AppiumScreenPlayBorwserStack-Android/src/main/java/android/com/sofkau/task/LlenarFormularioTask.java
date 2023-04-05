package android.com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.com.sofkau.ui.FlujoDeCompraUI.*;
import static android.com.sofkau.ui.FlujoDeCompraUI.CAMPO_CODIGO_POSTAL;

public class LlenarFormularioTask implements Task {
    private String nombre;
    private String apellido;
    private String zipCode;
    public LlenarFormularioTask nombre (String nombre){
        this.nombre = nombre;
        return this;
    }
    public LlenarFormularioTask apellido (String apellido){
        this.apellido = apellido;
        return this;
    }
    public LlenarFormularioTask zipCode (String zipCode){
        this.zipCode = zipCode;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(CAMPO_FIRTS_NAME),
                Enter.theValue(nombre).into(CAMPO_FIRTS_NAME),
                Click.on(CAMPO_LAST_NAME),
                Enter.theValue(apellido).into(CAMPO_LAST_NAME),
                Click.on(CAMPO_CODIGO_POSTAL),
                Enter.theValue(zipCode).into(CAMPO_CODIGO_POSTAL)
        );
    }
    public static LlenarFormularioTask llenarFormularioTask() {return new LlenarFormularioTask();}
}