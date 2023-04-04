package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CheckoutCompleteScreen {
    public static final Target TITLE = Target.the("Thanks title")
            .located(xpath("//android.widget.ScrollView[@content-desc='test-CHECKOUT: COMPLETE!']/android.view.ViewGroup/android.widget.TextView[1]"));
}