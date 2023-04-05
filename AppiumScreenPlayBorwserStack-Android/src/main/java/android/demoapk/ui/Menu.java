package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Menu {

    public static final Target LOGOUT_BUTTON = Target.the("logout button")
            .located(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGOUT']"));
}
