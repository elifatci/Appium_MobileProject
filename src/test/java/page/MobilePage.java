package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;
import static utils.Driver.getAppiumDriver;
public class MobilePage extends Base {

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
    public WebElement logoQueryCard;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public WebElement searchBox;
    @AndroidFindBy(accessibility = "Sign In")
    public WebElement signInButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Profile']")
    public WebElement profileImageView;
    @AndroidFindBy(accessibility = "*Use Email Instead")
    public WebElement textUseEmail;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement textboxPhone;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement textboxPassword;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc='Sign In'])[2]")
    public WebElement buttonSignIn;
    @AndroidFindBy(accessibility = "Address")
    public WebElement menuAddress;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public WebElement iconFirstEdit;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
    public WebElement iconFirstRemove;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public WebElement textboxZipCode;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[5]")
    public WebElement messageUpdateXpath;
    @AndroidFindBy(accessibility = "Delete")
    public WebElement buttonDelete;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[5]")
    public WebElement messageDeleteSuccess;
    @AndroidFindBy(accessibility = "Add New Address")
    public WebElement buttonAddNewAddress;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement textBoxAddressFullName;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement textBoxAddressEmail;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement textBoxAddressPhone;
    @AndroidFindBy(accessibility = "Country")
    public WebElement dropdownCountry;
    @AndroidFindBy(accessibility = "Albania")
    public WebElement optionAlbania;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public WebElement textBoxAddressZipCode;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public WebElement textBoxAddressStreet;
    @AndroidFindBy(accessibility = "Add Address")
    public WebElement buttonAddAddress;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[10]")
    public WebElement messageRequiredName;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[13]")
    public WebElement messageRequiredPhone;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[20]")
    public WebElement messageRequiredStreet;
    @AndroidFindBy(xpath = "//*[@text='Elif Atcı']")
    public WebElement textboxEditFullName;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[5]")
    public WebElement messageProfileUpdate;
    @AndroidFindBy(accessibility = "Go to Shopping")
    public WebElement buttonGoToShopping;
    @AndroidFindBy(accessibility = "Subtotal")
    public WebElement textSubTotal;
    @AndroidFindBy(accessibility = "Shopping Cart")
    public WebElement textShoppingCart;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
    public WebElement iconRemoveProduct;
    @AndroidFindBy(accessibility = "Proceed to Checkout")
    public WebElement buttonProceedToCheckout;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[20]")
    public WebElement imageMostPopularFirstProduct;
    @AndroidFindBy(accessibility = "S")
    public WebElement imageMostPopularFirstProductSize;
    @AndroidFindBy(accessibility = "Add To Cart")
    public WebElement buttonAddToCart;
    @AndroidFindBy(accessibility = "Home")
    public WebElement linkHome;
    @AndroidFindBy(accessibility = "Profile")
    public WebElement linkProfile;
    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement textSearcBox;
    @AndroidFindBy(accessibility = "Most Popular")
    public WebElement textMostPopular;
    @AndroidFindBy(accessibility = "$100.00")
    public WebElement textFirstProductPrice;
    @AndroidFindBy(accessibility = "Quantity:")
    public WebElement textFirstProductQuantity;
    @AndroidFindBy(accessibility = "Product Details")
    public WebElement textFirstProductProductDetails;
    @AndroidFindBy(accessibility = "Sign Up")
    public WebElement buttonSignUp;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement textBoxNameSignUp;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement textBoxPhoneSignUp;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement textBoxPasswordSignUp;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement textBoxEmailSignUp;
    @AndroidFindBy(accessibility = "*Use Phone Instead")
    public WebElement textUsePhone;
    @AndroidFindBy(xpath = "(//*[@content-desc='Sign Up'])[2]")
    public WebElement buttonSignUpRegister;
    @AndroidFindBy(accessibility = "This field is required")
    public WebElement messageThisFieldIsRequired;
    @AndroidFindBy(accessibility = "Error The phone field must be at least 7 characters.This field is required")
    public WebElement messageRequiredPhoneSignUp;
    @AndroidFindBy(accessibility = "Enter Valid Email Address")
    public WebElement messageEmailSignUp;
    @AndroidFindBy(accessibility = "Password is short")
    public WebElement messagePasswordIsShortSignUp;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
    public WebElement radioButtonRemeberMe;
    @AndroidFindBy(accessibility = "Forgot Password")
    public WebElement linkForgetPassword;
    @AndroidFindBy(accessibility = "Get OTP")
    public WebElement buttonGetOTP;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
    public WebElement iconFilter;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public WebElement iconBackMostPopular;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Floral Print Midi Dress\n" +
            "0 (0  Reviews)\n" +
            "$100.00\"]")
    public WebElement seeAllProduct1;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Classic Cotton T-Shirt\n" +
            "0 (0  Reviews)\n" +
            "$20.00\"]")
    public WebElement seeAllProduct2;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public WebElement anyOrderDetail;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement textBoxOldPassword;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement textBoxNewPassword;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement textBoxConfirmPassword;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement textBoxNewPassReset;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement textBoxConfirmPassReset;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[4]")
    public WebElement firstAddress;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement cardNumber;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement cardDate;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement cardCVC;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public WebElement cardZipCode;
    @AndroidFindBy(xpath ="(//*[@class='android.widget.ImageView'])[2]" )
    public WebElement firstDelivered;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public WebElement radioButtonDelivered;

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[14]")
    public WebElement dropdownReturnReason;
    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement returnNoteTextBox;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[4]")
    public WebElement iconFavorite;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]")
    public WebElement iconFirstWishlist;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[10]")
    public WebElement iconThirdWishlist;


    public void methodSignIn(String phone, String password) throws MalformedURLException, InterruptedException {
        signInButton.click();
        ReusableMethods.wait(3);
        textboxPhone.click();
        textboxPhone.sendKeys(ConfigReader.getProperty(phone));
        textboxPassword.click();
        textboxPassword.sendKeys(ConfigReader.getProperty(password));
        buttonSignIn.click();
        ReusableMethods.wait(3);
    }

    public void methodDisplayedEnabled(WebElement element) {
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
    }

    public void methodDisplayed(WebElement element) {
        ReusableMethods.wait(2);
        assertTrue(element.isDisplayed());
    }

    public void clickAndSendKeys(WebElement element, String text) {
        element.click();
        element.clear();
        element.sendKeys(text);
        ReusableMethods.wait(2);
    }

    public void signInClick() {
        assertTrue(signInButton.isDisplayed());
        signInButton.click();
    }

    public void editableAddress() throws InterruptedException {
        ReusableMethods.wait(1);
        iconFirstEdit.click();
        ReusableMethods.wait(4);
        textboxZipCode.click();
        textboxZipCode.clear();
        textboxZipCode.sendKeys("010101");
        ReusableMethods.scroll(driver, 2);
        ReusableMethods.wait(2);
        ReusableMethods.coordinateClick(297, 1324);
        // methods.buttonUpdateAddress.click();
        ReusableMethods.wait(1);
        assertTrue(messageUpdateXpath.isDisplayed());
        ReusableMethods.wait(3);
    }

    public WebElement contentXpath(String text) {
        WebElement element = driver.findElement(By.xpath("//*[@content-desc='" + text + "']"));
        return element;
    }

    public void contentXpathClick(String text) {
        driver.findElement(By.xpath("//*[@content-desc='" + text + "']")).click();

    }

    public void entryCard(String number, String date, String cvc, String zipCode) throws InterruptedException {
        ReusableMethods.wait(1);
        mobilePage.clickAndSendKeys(cardNumber, number);
        ReusableMethods.wait(1);
        mobilePage.clickAndSendKeys(cardDate, date);
        ReusableMethods.wait(1);
        mobilePage.clickAndSendKeys(cardCVC, cvc);
        ReusableMethods.wait(1);
        mobilePage.clickAndSendKeys(cardZipCode, zipCode);

    }
}
