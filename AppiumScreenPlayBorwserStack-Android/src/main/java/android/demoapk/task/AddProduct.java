package android.demoapk.task;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static android.demoapk.driver.AndroidDriverr.driver;
import static android.demoapk.ui.ProductsView.ADD_TO_CART_BUTTON;
public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(
                        Click.on(ADD_TO_CART_BUTTON)
                );
    }
    public static AddProduct addProduct(){
        return new AddProduct();
    }


}
