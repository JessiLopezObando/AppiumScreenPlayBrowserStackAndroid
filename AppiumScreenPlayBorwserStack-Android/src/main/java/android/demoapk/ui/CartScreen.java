package android.demoapk.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class CartScreen extends PageObject {

    public static final Target CHECKOUT_BUTTON = Target.the("checkout button")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView"));



}
