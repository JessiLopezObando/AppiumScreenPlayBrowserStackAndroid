package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ElegirProductoLocal {

    public static final Target ADD_PRODUCTO = Target
            .the("AddProducto")
            .located(xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView"));

    public static final Target CARRITO_COMPRA = Target
            .the("Carrito de compra")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView"));
    public static final Target BOTON_CHECKOUT = Target
            .the("Checkoout")
            .located(xpath("\t\n" +
                    "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView"));

}
