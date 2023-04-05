package android.demoapk.ui;

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

    private Login() {
    }
}

