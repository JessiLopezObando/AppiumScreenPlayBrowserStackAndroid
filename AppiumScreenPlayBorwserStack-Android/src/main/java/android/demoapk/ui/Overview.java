package android.demoapk.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Overview {

    public static final Target FINISH_BUTTON=Target.the("Boton Finalizar")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]"));
}
