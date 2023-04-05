package android.demoapk.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;


public class MensajeConfirmacionInicioSesionInvalidai {

    public static final Target MENSAJE_CIERRE_SESION = Target
            .the("Mensaje esperado despues de realizar la compra")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView"));


    public static Question<String> isEqualTo(){
    return TheTarget.textOf(MENSAJE_CIERRE_SESION);
}
    private MensajeConfirmacionInicioSesionInvalidai() {
    }


}