package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class FlujoDeCompraUI {
    public static final Target CAMPO_USERNAME = Target
            .the("Username")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"));
    public static final Target CAMPO_PASSWORD = Target
            .the("Password")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"));
    public static final Target BOTON_LOGIN = Target
            .the("Password")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));
    public static final Target PRODUCTO_MORRAL = Target
            .the("producto morral")
            .located(xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]/android.view.ViewGroup/android.widget.ImageView"));
    public static final Target BOTON_AGREGAR_AL_CARRITO_MORRAL = Target
            .the("agregar al carrito el morral")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]"));
    public static final Target BOTON_REGRESAR_HOME = Target
            .the("Boton Home")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-BACK TO PRODUCTS\"]"));
    public static final Target PRODUCTO_SAUCE_LABS_BIKE_LIGHT = Target
            .the("producto sauce labs bike light")
            .located(xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[2]/android.view.ViewGroup/android.widget.ImageView"));
    public static final Target BOTON_AGREGAR_AL_CARRITO_SAUCE_LABS_BIKE_LIGHT = Target
            .the("agregar al carrito sauce labs bike light")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]"));
    public static final Target BOTON_VER_CARRITO = Target
            .the("Boton ver carrito")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView"));
    public static final Target BOTON_CHECKOUT = Target
            .the("Boton checkout")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]"));


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////// LLENO LOS DATOS
    public static final Target CAMPO_FIRTS_NAME = Target
            .the("CAMPO firts name")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]"));
    public static final Target CAMPO_LAST_NAME = Target
            .the("CAMPO last name")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]"));
    public static final Target CAMPO_CODIGO_POSTAL = Target
            .the("CAMPO codigo postal")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]"));
    public static final Target BOTON_CONTINUAR = Target
            .the("Boton Continuar")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView"));

    public static final Target BOTON_FINISH = Target
            .the("Boton finish")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]"));

    public static final Target MENSAJE_ASERCION = Target
            .the("THANK YOU FOR YOU ORDER")
            .located(xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]"));

    public static final Target OBJETO_ASERCION = Target
        .the("objeto de la asercion")
        .located(xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.ImageView"));
}
