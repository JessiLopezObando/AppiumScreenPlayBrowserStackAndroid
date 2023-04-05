package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CheckoutInfoScreen {
    public static final Target FIRST_NAME = Target.the("Input first name box")
            .located(xpath("//*[@content-desc='test-First Name']"));

    public static final Target LAST_NAME = Target.the("Input last name box")
            .located(xpath("//*[@content-desc='test-Last Name']"));

    public static final Target ZIPCODE = Target.the("Input zipcode box")
            .located(xpath("//*[@content-desc='test-Zip/Postal Code']"));

    public static final Target CONTINUE_BTTN = Target.the("Continue button")
            .located(xpath("//*[@content-desc='test-CONTINUE']"));
}