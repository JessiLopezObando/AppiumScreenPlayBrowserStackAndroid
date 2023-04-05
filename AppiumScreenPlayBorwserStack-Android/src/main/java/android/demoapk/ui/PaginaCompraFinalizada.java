package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class PaginaCompraFinalizada {
    public static final Target MSJ_COMPRA = Target
            .the("MSJ compra")
            .located(xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]"));


}
