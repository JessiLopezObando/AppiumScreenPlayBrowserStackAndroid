package com.sofkau.setup;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static com.sofkau.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {
    protected static final Actor ACTOR = Actor.named("Ivan");
    @Managed(driver = "Appium")
    protected WebDriver theMobileDevice;
    protected void quitarDriver() {
        theMobileDevice.quit();
    }
    private void setupUser() {
        OnStage.setTheStage(new OnlineCast());
        ACTOR.can(BrowseTheWeb.with(theMobileDevice));
    }
    protected void configurarCelular() {
        setupUser();
        setUplog4j();
    }
    private void setUplog4j() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
}


