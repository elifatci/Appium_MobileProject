package utils;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Collections;
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

    public static void typeWithKeyBoard(String word){
        for (char c : word.toCharArray()) {
            System.out.println("c:"+ c);
            char a =Character.toUpperCase(c);
            if (a=='A'){
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.A));
            } else if (a=='B') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.B));
            } else if (a=='C') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.C));
            } else if (a=='D') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.D));
            } else if (a=='E') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.E));
            } else if (a=='F') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.F));
            } else if (a=='G') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.G));
            } else if (a=='Ğ') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.G));
            }else if (a=='H'){
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.H));
            } else if (a=='I') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.I));
            } else if (a=='İ') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.I));
            } else if (a=='J') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.J));
            } else if (a=='K') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.K));
            } else if (a=='L') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.L));
            }else if (a=='M'){
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.M));
            } else if (a=='N') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.N));
            } else if (a=='O') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.O));
            } else if (a=='Ö') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.O));
            } else if (a=='P') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.P));
            } else if (a=='R') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.R));
            } else if (a=='S') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.S));
            }else if (a=='Ş'){
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.S));
            } else if (a=='T') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.T));
            } else if (a=='U') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.U));
            } else if (a=='Ü') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.U));
            } else if (a=='V') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.V));
            } else if (a=='Y') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.Y));
            } else if (a=='Z') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.Z));
            } else if (a=='W') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.W));
            } else if (a=='Q') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.Q));
            } else if (a=='X') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.X));
            } else if (a==' ') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.SPACE));
            } else if (a==',') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.COMMA));
            } else if (a=='.') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.PERIOD));
            } else if (a=='-') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.MINUS));
            } else if (a=='+') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.PLUS));
            } else if (a=='@') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.AT));
            } else if (a=='_') {
                ((AndroidDriver)Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.valueOf("KEYCODE_95")));
            }
        }
    }

    /*
    public static final boolean isGamepadButton(int keyCode) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BUTTON_A:
            case KeyEvent.KEYCODE_BUTTON_B:
            case KeyEvent.KEYCODE_BUTTON_C:
            case KeyEvent.KEYCODE_BUTTON_X:
            case KeyEvent.KEYCODE_BUTTON_Y:
            case KeyEvent.KEYCODE_BUTTON_Z:
            case KeyEvent.KEYCODE_BUTTON_L1:
            case KeyEvent.KEYCODE_BUTTON_R1:
            case KeyEvent.KEYCODE_BUTTON_L2:
            case KeyEvent.KEYCODE_BUTTON_R2:
            case KeyEvent.KEYCODE_BUTTON_THUMBL:
            case KeyEvent.KEYCODE_BUTTON_THUMBR:
            case KeyEvent.KEYCODE_BUTTON_START:
            case KeyEvent.KEYCODE_BUTTON_SELECT:
            case KeyEvent.KEYCODE_BUTTON_MODE:
            case KeyEvent.KEYCODE_BUTTON_1:
            case KeyEvent.KEYCODE_BUTTON_2:
            case KeyEvent.KEYCODE_BUTTON_3:
            case KeyEvent.KEYCODE_BUTTON_4:
            case KeyEvent.KEYCODE_BUTTON_5:
            case KeyEvent.KEYCODE_BUTTON_6:
            case KeyEvent.KEYCODE_BUTTON_7:
            case KeyEvent.KEYCODE_BUTTON_8:
            case KeyEvent.KEYCODE_BUTTON_9:
            case KeyEvent.KEYCODE_BUTTON_10:
            case KeyEvent.KEYCODE_BUTTON_11:
            case KeyEvent.KEYCODE_BUTTON_12:
            case KeyEvent.KEYCODE_BUTTON_13:
            case KeyEvent.KEYCODE_BUTTON_14:
            case KeyEvent.KEYCODE_BUTTON_15:
            case KeyEvent.KEYCODE_BUTTON_16:
                return true;
            default:
                return false;
        }
    }
     */
    public static void waitToBeClickable(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitToBeVisible(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    private static Point getCenterOfElement(Point location, Dimension size){
        return new Point(location.getX() + size.getWidth() /2,
                location.getY() + size.getHeight() /2);
    }
    public static void tap(AppiumDriver driver, WebElement element) {
        Point location = element.getLocation();
        Dimension size = element.getSize();

        Point centerOfElement = getCenterOfElement(location, size);

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(100)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));
    }
    public static void scroll(AppiumDriver driver, int scroll) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2 ;
        int startY = size.getHeight() / 2 ;
        int endX = startX;
        int endY = (int) (size.getHeight()*0.25);
        //buradaki 0,25 şu şekildedir; imleç ekranın ortasında yani 0,50 de,
        // y ekseninde 0,25 seçtiğimizde 0,50 den 0,25 e çekiyor yani aşağı  kayıyor.
        // Eğer 0,75 deseydik ters yönde  kaydıracaktı. Ne kadar kaydıracağı ise değişiyor.


        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        for (int i = 0; i <scroll ; i++) {
            Sequence sequence = new Sequence(finger1,1).
                    addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), startX, startY)).
                    addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg())).
                    addAction(new Pause(finger1, Duration.ofMillis(100))).
                    addAction(finger1.createPointerMove(Duration.ofMillis(300),PointerInput.Origin.viewport(),endX,endY)).
                    addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            driver.perform(Collections.singletonList(sequence));}
        Thread.sleep(3000);
    }

    public static void backToPreScreen(){
        //Driver.getDriver().navigate().back();
        KeyEvent back=new KeyEvent(AndroidKey.BACK);
        ((AndroidDriver)Driver.getAppiumDriver()).pressKey(back);
    }

    public static void enterKeywoard(){
        KeyEvent enter=new KeyEvent(AndroidKey.ENTER);
        ((AndroidDriver)Driver.getAppiumDriver()).pressKey(enter);

    }
}
