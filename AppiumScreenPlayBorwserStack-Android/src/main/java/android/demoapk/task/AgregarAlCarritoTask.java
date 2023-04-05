package android.demoapk.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static android.demoapk.ui.FlujoDeCompraUI.*;


public class AgregarAlCarritoTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(BOTON_VER_CARRITO)

        );
    }
    public static AgregarAlCarritoTask agregarAlCarritoTask() {return new AgregarAlCarritoTask();}
}