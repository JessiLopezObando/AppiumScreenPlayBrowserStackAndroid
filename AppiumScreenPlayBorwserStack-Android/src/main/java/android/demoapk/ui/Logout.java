package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class Logout {
    public static final Target MENU_LOGOUT = Target
            .the("User")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView"));

    public static final Target LOGOUT = Target
            .the("Pass")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]"));


}
