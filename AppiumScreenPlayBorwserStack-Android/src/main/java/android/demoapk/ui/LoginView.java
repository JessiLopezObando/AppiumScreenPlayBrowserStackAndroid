package android.demoapk.ui;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginView {
    public static final Target USER_INPUT=Target.the("Campo de user")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"));

    public static final Target PASSWORD_INPUT=Target.the("Campo de clave")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"));

    public static final Target LOGIN_BUTTON=Target.the("Boton de login")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));

}
