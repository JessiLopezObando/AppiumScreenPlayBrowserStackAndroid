package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CheckoutOverviewScreen {
    public static final Target FINISH_BTTN = Target.the("Finish button")
            .located(xpath("//android.view.ViewGroup[@content-desc='test-FINISH']"));
}