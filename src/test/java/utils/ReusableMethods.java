package utils;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import page.Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static java.time.Duration.ofMillis;
import static java.util.Collections.singletonList;
import static utils.Driver.getAppiumDriver;

public class ReusableMethods extends Base {
    public static void dowloandApk() {
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("version"));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP,ConfigReader.getProperty(apk));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, ConfigReader.getProperty("appPackage"));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ConfigReader.getProperty("appActivity"));
    }

    public static void newClickCoordinate(int xKoordinat, int yKoordinat, int bekleme, WebElement slider) throws InterruptedException {
        Point source = slider.getLocation();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1);
        sequence.addAction(finger.createPointerMove(ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        sequence.addAction(new Pause(finger, ofMillis(600)));
        sequence.addAction(finger.createPointerMove(ofMillis(600),
                PointerInput.Origin.viewport(), source.x + 400, source.y));
        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));

        getAppiumDriver().perform(singletonList(sequence));
    }

    public static void clickCoordinate(int x, int y) throws InterruptedException {
        action.press(PointOption.point(x, y)).release().perform();
        Thread.sleep(1000);
    }

    public static void scrollWithUiScrollableAndClick(String elementText) {
        driver.findElement(By.xpath("//*[@text='" + elementText + "']")).click();

    }

    public static void scrollWithUiScrollable(String elementText) {
        driver.findElement(By.xpath("//*[@text='" + elementText + "']"));
    }

    public static void scrollPage(int xPress, int yPress, int wait, int xMove, int yMove) {
        action.press(PointOption.point(xPress, yPress))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait)))
                .moveTo(PointOption.point(xMove, yMove))
                .release()
                .perform();
    }

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
