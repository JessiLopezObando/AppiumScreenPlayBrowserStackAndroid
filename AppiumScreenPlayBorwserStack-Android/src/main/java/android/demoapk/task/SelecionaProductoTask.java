package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.Login.*;
import static android.demoapk.ui.PaginaProductos.*;


public class SelecionaProductoTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU),
                Click.on(ADD_PRODUCTO),
                Click.on(CARRITO)
        );
    }

    public static SelecionaProductoTask selecionaProductoTask() {return new SelecionaProductoTask();}
}
