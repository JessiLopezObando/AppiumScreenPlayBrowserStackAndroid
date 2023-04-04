package android.demoapk.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutView {

    public static final Target FIRST_NAME_INPUT=Target.the("Campo de first name")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]"));

    public static final Target LAST_NAME_INPUT=Target.the("Campo de last name")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]"));

    public static final Target ZIP_INPUT=Target.the("Campo de zip code")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]"));

    public static final Target CONTINUE_BUTTON=Target.the("Boton de continue")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]"));

}
