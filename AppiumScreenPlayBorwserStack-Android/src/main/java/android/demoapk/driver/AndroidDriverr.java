package android.demoapk.driver;

import io.appium.java_client.android.AndroidElement;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverr {
    public static io.appium.java_client.android.AndroidDriver<AndroidElement> driver;

    public static AndroidDriverr configureDriver() throws MalformedURLException {

//        Dotenv dotenv = Dotenv.configure().load();
//
//        String browserstackUser = dotenv.get("BROWSERSTACK_USER");
//        String browserstackKey = dotenv.get("BROWSERSTACK_KEY");

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            // Set your access credentials
            caps.setCapability("browserstack.user", "juandavidcardona_aOW1Qp");
            caps.setCapability("browserstack.key", "Ls49hDwxosTCj4eKYEHL");

            caps.setCapability("app", "bs://1f3fb8aae2c2d0c86d784323c3a0da59c0ea1ec5");

            // Specify device and os_version for testing
            caps.setCapability("device", "Xiaomi Redmi Note 8");
            caps.setCapability("os_version", "9");

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


