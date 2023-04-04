package android.demoapk.setup;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

import static android.demoapk.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;
import static com.google.common.base.StandardSystemProperty.USER_DIR;



public class Configuracion {

    protected Actor actor = Actor.named("User");
    @Managed(driver = "Appium")
    protected WebDriver theMobileDevice;

    protected void setUplog4j() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());

    }



}
