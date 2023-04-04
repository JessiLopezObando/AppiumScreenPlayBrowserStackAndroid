package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutOverviewScreen extends PageObject {

    public static final Target FINISH_BUTTON = Target.the("finish button")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]"));

    public static final Target PAYMENT_INFORMATION_MESSAGE = Target.the("payment information")
            .located(By.xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: OVERVIEW\"]/android.view.ViewGroup/android.widget.TextView[1]"));

    public static final Target COMPLETE_ORDER_MESSAGE = Target.the("complete order message")
            .located(By.xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]"));


}
