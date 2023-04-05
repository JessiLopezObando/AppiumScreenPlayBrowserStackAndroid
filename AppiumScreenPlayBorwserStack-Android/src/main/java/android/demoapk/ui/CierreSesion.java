package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CierreSesion {

    public static final Target BOTON_BACK_HOME = Target
            .the("Boton Logout")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-BACK HOME\"]/android.widget.TextView"));

    public static final Target MENU = Target
            .the("Boton menu")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView"));

    public static final Target LOGOUT = Target
            .the("Boton Logout")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]"));

}
