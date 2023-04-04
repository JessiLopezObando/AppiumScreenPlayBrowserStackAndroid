package android.demoapk.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CartView {

    public static final Target CHECKOUT_BUTTON=Target.the("Boton de checkout")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]"));


}
