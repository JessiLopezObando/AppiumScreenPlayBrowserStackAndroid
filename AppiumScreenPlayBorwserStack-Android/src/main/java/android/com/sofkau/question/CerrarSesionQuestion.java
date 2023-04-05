package android.com.sofkau.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static android.com.sofkau.ui.CerrarSesionUI.MENSAJE_ASERCION_CERRAR_SESION;

public class CerrarSesionQuestion {

    private CerrarSesionQuestion(){}
    public static Question <String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_ASERCION_CERRAR_SESION);

    }
}
