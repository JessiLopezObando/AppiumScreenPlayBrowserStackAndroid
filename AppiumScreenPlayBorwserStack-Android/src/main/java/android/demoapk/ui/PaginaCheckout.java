package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class PaginaCheckout {
    public static final Target BUTTON_CHECKOUT = Target
            .the("Botón checkout")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]"));

    public static final Target INPUT_NAME = Target
            .the("Name usuario")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]"));

    public static final Target INPUT_LAST_NAME = Target
            .the("Last Name usuario")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]"));

    public static final Target INPUT_ZIP_CODE = Target
            .the("Zip code")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]"));
    public static final Target BUTTON_CONTINUE = Target
            .the("Botón continuar")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]"));
    public static final Target BUTTON_FINALIZAR = Target
            .the("Botón continuar")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]"));
}
