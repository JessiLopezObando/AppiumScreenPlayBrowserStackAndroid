package android.com.sofkau.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.com.sofkau.ui.FlujoDeCompraUI.BOTON_AGREGAR_AL_CARRITO_MORRAL;
import static android.com.sofkau.ui.FlujoDeCompraUI.BOTON_AGREGAR_AL_CARRITO_SAUCE_LABS_BIKE_LIGHT;

public class SeleccionarProductosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BOTON_AGREGAR_AL_CARRITO_MORRAL),
                Click.on(BOTON_AGREGAR_AL_CARRITO_SAUCE_LABS_BIKE_LIGHT)

        );

    }
    public static SeleccionarProductosTask seleccionarProductosTask() {return new SeleccionarProductosTask();}
}
