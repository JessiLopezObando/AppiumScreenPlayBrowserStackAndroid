package android.demoapk.setup;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import static android.demoapk.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;
import static com.google.common.base.StandardSystemProperty.USER_DIR;



public class Configuracion {

    protected Actor actor = Actor.named("User");

    protected void setUplog4j() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());

    }



}
