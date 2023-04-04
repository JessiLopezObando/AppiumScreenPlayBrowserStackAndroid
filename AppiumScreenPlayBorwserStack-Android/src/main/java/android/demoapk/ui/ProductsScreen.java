package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsScreen extends PageObject {

    public static final Target PRODUCTS_MESSAGE = Target.the("products message")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));

}
