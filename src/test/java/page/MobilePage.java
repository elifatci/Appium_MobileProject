package page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.ReusableMethods;

import java.net.MalformedURLException;

import static org.junit.Assert.assertTrue;
import static utils.Driver.getAppiumDriver;
public class MobilePage extends Base{

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]") public WebElement logoQueryCard;
    @AndroidFindBy (xpath = "(//*[@class='android.widget.ImageView'])[2]") public WebElement searchBox;
    @AndroidFindBy (accessibility = "Sign In") public WebElement signInButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Profile']") public WebElement profileImageView;
    @AndroidFindBy(accessibility = "*Use Email Instead") public WebElement textUseEmail;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]") public WebElement textboxPhone;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]") public WebElement textboxPassword;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc='Sign In'])[2]") public WebElement buttonSignIn;
    @AndroidFindBy(accessibility = "Address") public WebElement menuAddress;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]") public WebElement iconFirstEdit;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]") public WebElement iconFirstRemove;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[4]") public WebElement textboxZipCode;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[5]") public WebElement messageUpdateXpath;
    @AndroidFindBy(accessibility = "Delete") public WebElement buttonDelete;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[5]") public WebElement messageDeleteSuccess;
    @AndroidFindBy(accessibility = "Add New Address") public WebElement buttonAddNewAddress;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]") public WebElement textBoxAddressFullName;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]") public WebElement textBoxAddressEmail;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]") public WebElement textBoxAddressPhone;
    @AndroidFindBy(accessibility = "Country") public WebElement dropdownCountry;
    @AndroidFindBy(accessibility = "Albania") public WebElement optionAlbania;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[4]") public WebElement textBoxAddressZipCode;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[4]") public WebElement textBoxAddressStreet;
    @AndroidFindBy(accessibility = "Add Address") public WebElement buttonAddAddress;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[10]") public WebElement messageRequiredName;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[13]") public WebElement messageRequiredPhone;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[20]") public WebElement messageRequiredStreet;
    @AndroidFindBy(accessibility = "Edit Profile") public WebElement menuEditProfile;
    @AndroidFindBy(accessibility = "Save Changes") public WebElement buttonSaveChangesEditProfile;
    @AndroidFindBy(xpath = "//*[@text='Elif Atcı']") public WebElement textboxEditFullName;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[5]") public WebElement messageProfileUpdate;
    @AndroidFindBy(accessibility = "Go to Shopping") public WebElement buttonGoToShopping;
    @AndroidFindBy(accessibility = "Subtotal") public WebElement textSubTotal;
    @AndroidFindBy(accessibility = "Shopping Cart") public WebElement textShoppingCart;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[3]") public WebElement iconRemoveProduct;
    @AndroidFindBy(accessibility = "Proceed to Checkout") public WebElement buttonProceedToCheckout;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[20]") public WebElement imageMostPopularFirstProduct;
    @AndroidFindBy(accessibility = "S") public WebElement imageMostPopularFirstProductSize;
    @AndroidFindBy(accessibility = "Add To Cart") public WebElement buttonAddToCart;
    @AndroidFindBy(accessibility = "Home") public WebElement linkHome;
    @AndroidFindBy(accessibility = "Category") public WebElement linkCategory;
    @AndroidFindBy(accessibility = "Wishlist") public WebElement linkWishlist;
    @AndroidFindBy(accessibility = "Profile") public WebElement linkProfile;
    @AndroidFindBy(className = "android.widget.EditText") public WebElement textSearcBox;
    @AndroidFindBy(accessibility = "Most Popular") public WebElement textMostPopular;
    @AndroidFindBy(accessibility = "$100.00") public WebElement textFirstProductPrice;
    @AndroidFindBy(accessibility = "Quantity:") public WebElement textFirstProductQuantity;
    @AndroidFindBy(accessibility = "Product Details") public WebElement textFirstProductProductDetails;
    @AndroidFindBy(accessibility = "Sign Up") public WebElement buttonSignUp;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]") public WebElement textBoxNameSignUp;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]") public WebElement textBoxPhoneSignUp;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]") public WebElement textBoxPasswordSignUp;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]") public WebElement textBoxEmailSignUp;
    @AndroidFindBy(accessibility = "*Use Phone Instead") public WebElement textUsePhone;
    @AndroidFindBy(xpath = "(//*[@content-desc='Sign Up'])[2]") public WebElement buttonSignUpRegister;
    @AndroidFindBy(accessibility = "This field is required") public WebElement messageThisFieldIsRequired;
    @AndroidFindBy(accessibility = "Error The phone field must be at least 7 characters.This field is required") public WebElement messageRequiredPhoneSignUp;
    @AndroidFindBy(accessibility = "Enter Valid Email Address") public WebElement messageEmailSignUp;
    public void methodSignIn(String phone,String password) throws MalformedURLException, InterruptedException {
        signInButton.click();
        ReusableMethods.wait(3);
        textboxPhone.click();
        textboxPhone.sendKeys(ConfigReader.getProperty(phone));
        textboxPassword.click();
        textboxPassword.sendKeys(ConfigReader.getProperty(password));
        buttonSignIn.click();
        ReusableMethods.wait(3);
    }
    public void methodDisplayedEnabled(WebElement element){
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
    }
    public void methodDisplayed(WebElement element){
        ReusableMethods.wait(2);
        assertTrue(element.isDisplayed());
    }
    public void clickAndSendKeys(WebElement element,String text) {
        element.click();
        element.clear();
        element.sendKeys(text);
        ReusableMethods.wait(2);
    }
    public void signInClick(){
        assertTrue(signInButton.isDisplayed());
        signInButton.click();
    }
    public void editableAddress() throws InterruptedException {
        ReusableMethods.wait(1);
        iconFirstEdit.click();
        ReusableMethods.wait(4);
        textboxZipCode.click();
        ReusableMethods.wait(2);
        textboxZipCode.clear();
        textboxZipCode.sendKeys("010101");
        ReusableMethods.scrollPage(701,1273,750,701,261);
        ReusableMethods.wait(2);
        ReusableMethods.clickCoordinate(297,1324);
        // methods.buttonUpdateAddress.click();
        ReusableMethods.wait(1);
        assertTrue(messageUpdateXpath.isDisplayed());
        ReusableMethods.wait(3);
    }
}
