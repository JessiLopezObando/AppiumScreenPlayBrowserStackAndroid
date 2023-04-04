package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class LoginScreen {
    public static final Target USERNAME = Target.the("Input username box")
            .located(xpath("//android.widget.EditText[@content-desc='test-Username']"));

    public static final Target PASSWORD = Target.the("Input password box")
            .located(xpath("//android.widget.EditText[@content-desc='test-Password']"));

    public static final Target LOGIN_BTTN = Target.the("Login button")
            .located(xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"));
}