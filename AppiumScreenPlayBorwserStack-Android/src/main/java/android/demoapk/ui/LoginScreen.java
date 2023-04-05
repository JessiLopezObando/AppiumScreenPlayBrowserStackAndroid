package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class LoginScreen {
    public static final Target USERNAME = Target.the("Input username box")
            .located(xpath("//*[@content-desc='test-Username']"));

    public static final Target PASSWORD = Target.the("Input password box")
            .located(xpath("//*[@content-desc='test-Password']"));

    public static final Target LOGIN_BTTN = Target.the("Login button")
            .located(xpath("//*[@content-desc='test-LOGIN']"));

    public static final Target LOGIN_TEXT = Target.the("Login text")
            .located(xpath("//*[contains(@text,'The currently accepted usernames')]"));
}