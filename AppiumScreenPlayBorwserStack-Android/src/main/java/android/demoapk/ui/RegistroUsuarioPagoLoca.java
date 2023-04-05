package android.demoapk.ui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class RegistroUsuarioPagoLoca {
    public static final Target NOMBRE_USUARIO_PAGO = Target
            .the("Nombre usuario pago")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]"));

    public static final Target APELLIDO_USUARIO_PAGO = Target
            .the("Apellido usuario pago")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]"));

    public static final Target CODE_POSTAL = Target
            .the("Codigo postal")
            .located(xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]"));

    public static final Target BUTTON_CONTINUE = Target
            .the("Botón continuar")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView"));

    public static final Target BOTTON_TERMINAR = Target
            .the("Botón PARA TERMINAR LA COMPRAr")
            .located(xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]"));

}
