package android.demoapk.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;


public class MensajeConfirmacionCompra {

    public static final Target MENSAJE_DE_LA_COMPRA = Target
            .the("Mensaje esperado despues de realizar la compra")
            .located(xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]"));


    public static Question<String> isEqualTo(){
    return TheTarget.textOf(MENSAJE_DE_LA_COMPRA);
}
    private MensajeConfirmacionCompra() {
    }


}
