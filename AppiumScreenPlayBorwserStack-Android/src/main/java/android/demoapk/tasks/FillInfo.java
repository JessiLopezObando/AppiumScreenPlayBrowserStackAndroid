package android.demoapk.tasks;

import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.CheckoutInfoScreen.*;

public class FillInfo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Dotenv dotenv = Dotenv.configure().load();
        String name = dotenv.get("NAME");
        String lastName = dotenv.get("LAST_NAME");
        String zipcode = dotenv.get("ZIPCODE");
        actor.attemptsTo(
                Enter.theValue(name).into(FIRST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(zipcode).into(ZIPCODE),
                Click.on(CONTINUE_BTTN)
        );
    }

    public static FillInfo fillInfo() {
        return new FillInfo();
    }
}