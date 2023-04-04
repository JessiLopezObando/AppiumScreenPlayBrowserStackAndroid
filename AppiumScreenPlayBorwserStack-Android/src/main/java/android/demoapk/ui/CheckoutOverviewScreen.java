package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutOverviewScreen extends PageObject {

    public static final Target PAYMENT_INFORMATION_MESSAGE = Target.the("payment information message")
            .located(By.xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: OVERVIEW\"]/android.view.ViewGroup/android.widget.TextView[1]"));

}
