package com.sofkau.setup;

import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.net.URL;
import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static com.sofkau.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;

public class AndroidDriver {
    public static io.appium.java_client.android.AndroidDriver<AndroidElement> driver;

    public static AndroidDriver configureDriver() throws MalformedURLException {

        Dotenv dotenv = Dotenv.configure().load();

        String browserstackUser = dotenv.get("BROWSERSTACK_USER");
        String browserstackKey = dotenv.get("BROWSERSTACK_KEY");

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            // Set your access credentials
            caps.setCapability("browserstack.user", browserstackUser);
            caps.setCapability("browserstack.key", browserstackKey);

            caps.setCapability("app", "bs://9b37bc845f9e2c7b4219580dec6dbedc8aadf0c8");

            // Specify device and os_version for testing
            caps.setCapability("device", "Samsung Galaxy Note 20 Ultra");
            caps.setCapability("os_version", "10.0");

            // Set other BrowserStack capabilities
            caps.setCapability("project", "AndroidDemo");
            caps.setCapability("build", "Android SauceLab build");
            caps.setCapability("name", "Login test Android");

            driver =  new io.appium.java_client.android.AndroidDriver<AndroidElement>(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new AndroidDriver();
    }
    protected static final Actor ACTOR = Actor.named("James");

    protected void quitarDriver() {
        driver.quit();
    }
    private void setupUser() throws MalformedURLException {
        OnStage.setTheStage(new OnlineCast());
        ACTOR.can(BrowseTheWeb.with(configureDriver().start()));
    }
    protected void configurarCelular() throws MalformedURLException {
        setupUser();
        setUplog4j();
    }
    private void setUplog4j() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
    public io.appium.java_client.android.AndroidDriver<AndroidElement> start(){
        return driver;
    }

}
