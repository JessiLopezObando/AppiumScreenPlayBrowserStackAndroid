package android.demoapk.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;


public class LoginUsuarioMensaje {
    public static final Target MENSAJE_CONFIRMACION_LOGIN = Target
            .the("Mensaje de confirmacion")
            .located(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));

public static Question<String> isEqualTo(){
    return TheTarget.textOf(MENSAJE_CONFIRMACION_LOGIN);
}
    private LoginUsuarioMensaje() {
    }


}
