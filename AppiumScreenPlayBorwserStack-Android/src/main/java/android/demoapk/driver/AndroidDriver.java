package android.demoapk.driver;

import io.appium.java_client.android.AndroidElement;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriver {
    public static io.appium.java_client.android.AndroidDriver<AndroidElement> driver;

    public static AndroidDriver configureDriver() throws MalformedURLException {
        Dotenv dotenv = Dotenv.configure().load();
        String browserstackUser = dotenv.get("BROWSERSTACK_USER");
        String browserstackKey = dotenv.get("BROWSERSTACK_KEY");
        String browserstackApp = dotenv.get("BROWSERSTACK_APP");

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browserstack.user", browserstackUser);
            caps.setCapability("browserstack.key", browserstackKey);
            caps.setCapability("app", browserstackApp);
            caps.setCapability("device", "Xiaomi Redmi Note 11");
            caps.setCapability("os_version", "11");
            caps.setCapability("project", "AndroidDemo");
            caps.setCapability("build", "Android SauceLab build");
            caps.setCapability("name", "Buy test Android");
            caps.setCapability("nativeWebScreenshot", false);

            driver = new io.appium.java_client.android.AndroidDriver<AndroidElement>(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AndroidDriver();
    }

    public io.appium.java_client.android.AndroidDriver<AndroidElement> start() {
        return driver;
    }
}