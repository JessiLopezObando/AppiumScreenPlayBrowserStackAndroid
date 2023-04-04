package android.demoapk.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class CheckoutCompleteMessage {

    public static final Target FINAL_MESSAGE = Target
            .the("Mensaje de Gracias por la compra")
            .located(By.xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(FINAL_MESSAGE);
    }
    private CheckoutCompleteMessage() {
    }
}
