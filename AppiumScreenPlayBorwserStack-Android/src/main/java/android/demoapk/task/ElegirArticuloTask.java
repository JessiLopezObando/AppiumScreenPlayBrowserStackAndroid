package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static android.demoapk.ui.ElegirProductoLocal.*;


public class ElegirArticuloTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ADD_PRODUCTO),
                Click.on(CARRITO_COMPRA),
                Click.on(BOTON_CHECKOUT)

        );
    }

    public static ElegirArticuloTask selecionaProductoTask() {return new ElegirArticuloTask();}

}
