package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsScreen extends PageObject {

    public static final Target PRODUCTS_MESSAGE = Target.the("products message")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));

    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[2]"));

    public static final Target CART_ICON = Target.the("cart icon")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView"));

}
