package com.sofkau;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.net.URL;

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

            caps.setCapability("app", "bs://2300097c63d6c01ca17f31a0a2fa9998e0f315dd");

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

    public io.appium.java_client.android.AndroidDriver<AndroidElement> start(){
        return driver;
    }

}
