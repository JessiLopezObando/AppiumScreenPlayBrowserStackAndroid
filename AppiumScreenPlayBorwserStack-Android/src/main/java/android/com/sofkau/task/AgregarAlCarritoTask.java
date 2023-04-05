package android.com.sofkau.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static android.com.sofkau.ui.FlujoDeCompraUI.*;


public class AgregarAlCarritoTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(BOTON_VER_CARRITO)

        );
    }
    public static AgregarAlCarritoTask agregarAlCarritoTask() {return new AgregarAlCarritoTask();}
}