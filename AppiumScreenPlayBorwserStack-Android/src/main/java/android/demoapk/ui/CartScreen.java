package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CartScreen {
    public static final Target CHECKOUT_BTTN = Target.the("Checkout button")
            .located(xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']"));
}