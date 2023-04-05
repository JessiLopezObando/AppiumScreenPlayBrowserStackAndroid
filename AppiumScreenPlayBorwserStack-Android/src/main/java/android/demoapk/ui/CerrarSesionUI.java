package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CerrarSesionUI {
    public static final Target MENU = Target.the("Menu")
            .located(xpath("//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup/android.widget.ImageView"));

    public static final Target BOTON_LOGOUT = Target
            .the("Boton LOGOUT")
            .located(xpath("//android.view.ViewGroup[@content-desc='test-LOGOUT']"));

    public static final Target LOGO_ASERCION = Target
            .the("imagen del logo de la pantalla de inicio de sesion")
            .located(xpath("//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[2]"));


    public static final Target MENSAJE_ASERCION_CERRAR_SESION = Target
            .the("Mensaje de asercion cerrar sesion")
            .located(xpath("//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView"));
}
