package android.demoapk.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsView {

    public static final String TSHIRT_NUMBER3 = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[3]/android.view.ViewGroup/android.widget.ImageView";
    public static final Target ADD_TO_CART_BUTTON =Target.the("Boton add to cart")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[2]"));

    public static final Target CART_BUTTON =Target.the("Boton del carrito")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView"));

}
