package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class Login {
    public static final Target INPUT_USER = Target
            .the("User")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"));

    public static final Target INPUT_PASS = Target
            .the("Pass")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"));

    public static final Target BUTTON_LOGIN = Target
            .the("Logout")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));
}
