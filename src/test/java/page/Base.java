package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

import static utils.Driver.getAppiumDriver;

public abstract class Base {
    public Base() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)), this);
    }
    public static UiAutomator2Options options;
    public static AppiumDriver driver;
    public static DesiredCapabilities desiredCapabilities;
    public static MobilePage mobilePage;
    public static TouchAction action;



    public static void initialize(){
        mobilePage = new MobilePage();
        desiredCapabilities = new DesiredCapabilities();
        driver= Driver.getAppiumDriver();
        action=new TouchAction((PerformsTouchActions) getAppiumDriver());
    }
}
