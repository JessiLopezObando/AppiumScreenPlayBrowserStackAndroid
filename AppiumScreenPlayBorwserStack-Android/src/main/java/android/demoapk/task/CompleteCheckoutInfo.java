package android.demoapk.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.ui.CheckoutView.*;

public class CompleteCheckoutInfo implements Task {
    private String firstName;
    private String lastName;
    private String zip;

    public CompleteCheckoutInfo withFirst(String firstName){
        this.firstName=firstName;
        return this;
    }
    public CompleteCheckoutInfo withLast(String lastName){
        this.lastName=lastName;
        return this;
    }
    public CompleteCheckoutInfo withZip(String zip){
        this.zip=zip;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(FIRST_NAME_INPUT),
                Enter.theValue(lastName).into(LAST_NAME_INPUT),
                Enter.theValue(zip).into(ZIP_INPUT),
                Click.on(CONTINUE_BUTTON)
        );
    }
    public static CompleteCheckoutInfo completeCheckoutInfo(){
        return new CompleteCheckoutInfo();
    }
}
