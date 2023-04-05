package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginScreen extends PageObject {

    public static final Target USER_NAME = Target.the("user name")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"));

    public static final Target PASSWORD = Target.the("password")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));

    public static final Target LOGIN_MESSAGE = Target.the("login message")
            .located(By.xpath("//android.widget.TextView[contains(@text,'The currently accepted usernames')]"));
}
