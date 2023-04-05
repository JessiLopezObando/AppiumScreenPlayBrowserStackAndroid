package android.com.sofkau.task;

import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.com.sofkau.ui.FlujoDeCompraUI.*;

public class IniciarSesionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Dotenv dotenv = Dotenv.configure().load();
        String usuario = dotenv.get("SWAGLABS_USER");
        String contrasenna = dotenv.get("SWAGLABS_PASSWORD");
        actor.attemptsTo(
                Click.on(CAMPO_USERNAME),
                Enter.theValue(usuario).into(CAMPO_USERNAME),
                Click.on(CAMPO_PASSWORD),
                Enter.theValue(contrasenna).into(CAMPO_PASSWORD),
                Click.on(BOTON_LOGIN)
        );
    }
    public static IniciarSesionTask iniciarSesionTask() {return new IniciarSesionTask();}

}

