package android.demoapk.ui;


import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;


public class Login {

    public static final Target NOMBRE_USURIO = Target.the("Nombre usuario")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"));

    public static final Target PASSWORD_USUARIO = Target.the("Password usuario")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"));


    public static final Target BTN_LOGIN = Target
            .the("Boton login")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));
    ////android.view.ViewGroup[@content-desc="test-LOGIN"]/android.widget.TextView



    public static final Target OPCION_MENU = Target.the("Opcion de menu")
            .located(MobileBy.AccessibilityId("tab bar option menu"));
    private Login() {
    }
}

