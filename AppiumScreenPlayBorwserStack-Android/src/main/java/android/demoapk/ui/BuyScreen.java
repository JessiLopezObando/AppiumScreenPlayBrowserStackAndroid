package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class BuyScreen {
    public static final Target ADD_BTTN = Target.the("Add to cart button")
            .located(xpath("(//*[@content-desc='test-ADD TO CART'])[1]"));

    public static final Target CART = Target.the("Cart button")
            .located(xpath("//*[@content-desc='test-Cart']"));

    public static final Target MENU = Target.the("Menu")
            .located(xpath("//*[@content-desc='test-Menu']"));

    public static final Target LOGOUT = Target.the("Logout button")
            .located(xpath("//*[@content-desc='test-LOGOUT']"));
}