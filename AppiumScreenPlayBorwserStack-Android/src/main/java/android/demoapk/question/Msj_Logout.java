package android.demoapk.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static android.demoapk.ui.Login.BUTTON_LOGIN;
import static android.demoapk.ui.PaginaCompraFinalizada.MSJ_COMPRA;


public class Msj_Logout {


    public static Question<String> isEqualTo(){
        return TheTarget.textOf(BUTTON_LOGIN);
    }

    private Msj_Logout() {
    }

}
