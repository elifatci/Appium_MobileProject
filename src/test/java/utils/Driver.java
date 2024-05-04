package utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import page.Base;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class Driver extends Base {

    public static AppiumDriver getAppiumDriver() {
        URL appiumServerURL = null;
        try {
            //appiumServerURL = new URL("http://0.0.0.0:4723");
            appiumServerURL=new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (driver == null) {

            options = new UiAutomator2Options();
            options.setPlatformName("Android").setAutomationName("UiAutomator2");
            options.setAppPackage("com.inilabs.shopking");
            options.setAppActivity("com.inilabs.shopking.MainActivity");
            options.setUdid("emulator-5554");
            options.setNoReset(false);
            options.setNewCommandTimeout(Duration.ofMinutes(20));


            if (ConfigReader.getProperty("platformName").equals("Android")) {

                assert appiumServerURL != null;
                driver = new AndroidDriver(appiumServerURL,options);
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                Base.initialize();
            }

        }

        return driver;
    }

    public static void quitAppiumDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
