package android.demoapk.tasks;

import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.CheckoutScreen.*;


public class DiligenciarInfoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Dotenv dotenv = Dotenv.configure().load();
        String firstName = dotenv.get("FIRST_NAME");
        String lastName = dotenv.get("LAST_NAME");
        String zipCode = dotenv.get("ZIP_CODE");

        actor.attemptsTo(
                Enter.theValue(firstName).into(FIRST_NAME_BOX),
                Enter.theValue(lastName).into(LAST_NAME_BOX),
                Enter.theValue(zipCode).into(ZIP_CODE_BOX),
                Click.on(CONTINUE_BUTTON)
        );
    }

    public static DiligenciarInfoCompra diligenciarInfoCompra(){
        return new DiligenciarInfoCompra();
    }
}
