package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutScreen extends PageObject {

    public static final Target FIRST_NAME_BOX = Target.the("first name box")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]"));

    public static final Target LAST_NAME_BOX = Target.the("last name box")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]"));

    public static final Target ZIP_CODE_BOX = Target.the("zip code box")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]"));

    public static final Target CONTINUE_BUTTON = Target.the("continue button")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]"));
}
