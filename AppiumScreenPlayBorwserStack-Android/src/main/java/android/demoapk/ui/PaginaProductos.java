package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class PaginaProductos {
    public static final Target MENU = Target
            .the("Menu")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/android.widget.ImageView"));

    public static final Target ADD_PRODUCTO = Target
            .the("AddProducto")
            .located(xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[3]/android.widget.TextView"));

    public static final Target CARRITO = Target
            .the("Logout")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView"));
}
