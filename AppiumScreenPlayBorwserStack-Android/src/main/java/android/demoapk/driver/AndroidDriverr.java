package android.demoapk.driver;

import io.appium.java_client.android.AndroidElement;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverr {
    public static io.appium.java_client.android.AndroidDriver<AndroidElement> driver;

    public static AndroidDriverr configureDriver() throws MalformedURLException {

        Dotenv dotenv = Dotenv.configure().load();

        String browserstackUser = dotenv.get("BROWSERSTACK_USER");
        String browserstackKey = dotenv.get("BROWSERSTACK_KEY");
        String browserstackApp = dotenv.get("BROWSERSTACK_APP");

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            // Set your access credentials
            caps.setCapability("browserstack.user", "nevardoospina_YSokFx");
            caps.setCapability("browserstack.key", "XenBfV7uywaCAFbnujUm");

            caps.setCapability("app", "bs://99e68ca3d5a876eb60e34edd4fd7e86f2d2e7d25");

            // Specify device and os_version for testing
            caps.setCapability("device", "Xiaomi Redmi Note 9");
            caps.setCapability("os_version", "10");

            // Set other BrowserStack capabilities
            caps.setCapability("project", "AndroidDemo");
            caps.setCapability("build", "Android SauceLab build");
            caps.setCapability("name", "Login test Android");

            driver =  new io.appium.java_client.android.AndroidDriver<AndroidElement>(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new AndroidDriverr();
    }

    public io.appium.java_client.android.AndroidDriver<AndroidElement> start(){
        return driver;
    }

}


