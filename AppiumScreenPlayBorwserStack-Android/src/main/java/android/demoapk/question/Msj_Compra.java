package android.demoapk.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static android.demoapk.ui.PaginaCompraFinalizada.MSJ_COMPRA;
import static org.openqa.selenium.By.xpath;


public class Msj_Compra {


    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MSJ_COMPRA);
    }

    private Msj_Compra() {
    }

}
