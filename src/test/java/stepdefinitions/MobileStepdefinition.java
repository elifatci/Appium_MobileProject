package stepdefinitions;

import io.cucumber.java.en.When;
import page.Base;
import page.MobilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.Driver;
import utils.ReusableMethods;
import java.net.MalformedURLException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utils.Driver.getAppiumDriver;

public class MobileStepdefinition extends Base {

    @Given("Tap on Profile link")
    public void tap_on_profile_link() throws InterruptedException {
       ReusableMethods.wait(2);
      mobilePage.profileImageView.click();
    }
    @Given("Tap on Sıgn In button")
    public void tap_on_sıgn_ın_button() throws InterruptedException {
      ReusableMethods.wait(2);
        mobilePage.signInClick();
    }
    @Then("You can access the page with {string}, {string} valid information.")
    public void you_can_access_the_page_with_valid_information(String phone,String password) throws MalformedURLException, InterruptedException {
        mobilePage.methodSignIn(phone,password);
    }
    @Then("Verify that the Address menu title is visible and active in the Dashboard sideBar.")
    public void verify_that_the_address_menu_title_is_visible_and_active_in_the_dashboard_side_bar() {
        mobilePage.methodDisplayedEnabled(mobilePage.menuAddress);
    }
    @Then("Tap on the Address menu heading.")
    public void tap_on_the_address_menu_heading() {
        mobilePage.menuAddress.click();
    }
    @Then("It must be verified that the addresses registered on the address page are visible.")
    public void ıt_must_be_verified_that_the_addresses_registered_on_the_address_page_are_visible() {mobilePage.methodDisplayed(mobilePage.iconFirstEdit);}
    @Then("Verify that the edit icon and delete icon are visible and active in the registered addresses section.")
    public void verify_that_the_edit_icon_and_delete_icon_are_visible_and_active_in_the_registered_addresses_section() {
        mobilePage.methodDisplayedEnabled(mobilePage.iconFirstRemove);}
    @Then("Verify that registered addresses are editable")
    public void verify_that_registered_addresses_are_editable() throws InterruptedException {
        mobilePage.editableAddress();}
    @Then("It must be verified that registered addresses can be deleted.")
    public void ıt_must_be_verified_that_registered_addresses_can_be_deleted() {
        mobilePage.iconFirstRemove.click();
        mobilePage.buttonDelete.click();
        assertTrue(mobilePage.messageDeleteSuccess.isDisplayed());
    }
    @Then("Tap Add New Address button will appear and verify that it is active.")
    public void tap_add_new_address_button_will_appear_and_verify_that_it_is_active() {
        mobilePage.methodDisplayedEnabled(mobilePage.buttonAddNewAddress);}
    @Then("Tap on the Add new address button.")
    public void tap_on_the_add_new_address_button() {
        mobilePage.buttonAddNewAddress.click();
        ReusableMethods.wait(2);}
    @Then("Valid information is entered in the {string} and {string} textboxes.")
    public void valid_information_is_entered_in_the_and_textboxes(String name, String email) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressFullName, name);
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressEmail, email);}
    @Then("The {string} is entered by selecting the country code from the phone textbox.")
    public void the_is_entered_by_selecting_the_country_code_from_the_phone_textbox(String phone) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressPhone, phone);}
    @Then("Relevant options are selected from country status and city dropdowns.")
    public void relevant_options_are_selected_from_country_status_and_city_dropdowns() {
        mobilePage.dropdownCountry.click();
        mobilePage.optionAlbania.click();
    }
    @Then("The relevant {string} is entered into {int} {int} {int} {int} {int} the zip code textbox.")
    public void the_relevant_is_entered_into_the_zip_code_textbox(String zipcode, int x, int y, int wait, int xMove, int yMove) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressZipCode, zipcode);
        ReusableMethods.scrollPage(x, y, wait, xMove, yMove);
    }
    @Then("The relevant address is entered in the {string} textbox.")
    public void the_relevant_address_is_entered_in_the_textbox(String street) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressStreet, street);
    }
    @Then("Tap on the Add address button")
    public void tap_on_the_add_address_button() {
        mobilePage.buttonAddAddress.click();
    }
    @Then("It must be verified that the address has been added.")
    public void ıt_must_be_verified_that_the_address_has_been_added() {
        mobilePage.methodDisplayed(mobilePage.messageUpdateXpath);
    }
    @Then("It should be verified that the error message is visible when the full name is empty")
    public void ıt_should_be_verified_that_the_error_message_is_visible_when_the_full_name_is_empty() {
        mobilePage.buttonAddAddress.click();
        mobilePage.methodDisplayed(mobilePage.messageRequiredName);
    }
    @Then("It should be verified that the error message is visible when the phone is empty.")
    public void ıt_should_be_verified_that_the_error_message_is_visible_when_the_phone_is_empty() {
        mobilePage.buttonAddAddress.click();
        mobilePage.methodDisplayed(mobilePage.messageRequiredPhone);
    }
    @Then("It should be verified that the error message is visible when the street address is empty.")
    public void ıt_should_be_verified_that_the_error_message_is_visible_when_the_street_address_is_empty() {
        mobilePage.buttonAddAddress.click();
        mobilePage.methodDisplayed(mobilePage.messageRequiredStreet);
    }
    @Then("Valid information is entered in the {string} and {string} textbox.")
    public void valid_information_is_entered_in_the_and_textbox(String name, String phone) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressFullName,name);
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressPhone,phone);
    }
    @Then("Scroll down the page with valid {int} {int} {int} {int} {int} coordinates")
    public void scroll_down_the_page_with_valid_coordinates(int x, int y, int wait, int xMove, int yMove) {
        ReusableMethods.scrollPage(x,y,wait,xMove,yMove);
    }
    @Then("Valid information is entered in the {string} textbox.")
    public void valid_information_is_entered_in_the_textbox(String street) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressStreet,street);
    }
    @Then("Verify that the Edit profile menu is visible")
    public void verify_that_the_edit_profile_menu_is_visible() {
        mobilePage.methodDisplayed(mobilePage.menuEditProfile);
    }
    @Then("Tap on the edit profile link")
    public void tap_on_the_edit_profile_link() {
        mobilePage.menuEditProfile.click();
    }
    @Then("Verify that the Save Changes button is visible and active.")
    public void verify_that_the_save_changes_button_is_visible_and_active() {
        mobilePage.methodDisplayedEnabled(mobilePage.buttonSaveChangesEditProfile);
    }
    @Then("Full {string} information is updated")
    public void full_information_is_updated(String name) throws InterruptedException {
        mobilePage.clickAndSendKeys(mobilePage.textboxEditFullName,name);
    }
    @Then("Click on the save changes button")
    public void click_on_the_save_changes_button() {
        mobilePage.buttonSaveChangesEditProfile.click();
    }
    @Then("Verify that the successfully replaced message is displayed.")
    public void verify_that_the_successfully_replaced_message_is_displayed() {
        mobilePage.methodDisplayed(mobilePage.messageProfileUpdate);
    }
    @Then("Tap on the cart icon {int} {int}")
    public void tap_on_the_cart_icon(Integer x, Integer y) throws InterruptedException {
        ReusableMethods.wait(2);
        ReusableMethods.clickCoordinate(x,y);
    }
    @Then("Verify that you are directed to the relevant page.")
    public void verify_that_you_are_directed_to_the_relevant_page() {
        mobilePage.methodDisplayed(mobilePage.textShoppingCart);
    }
    @Then("If there are no items in the cart, the Go to Shopping button will appear and it must be verified that it is active.")
    public void ıf_there_are_no_items_in_the_cart_the_go_to_shopping_button_will_appear_and_it_must_be_verified_that_it_is_active() {
        mobilePage.methodDisplayed(mobilePage.buttonGoToShopping);
    }
    @Then("Tap on Go to Shopping button")
    public void tap_on_go_to_shopping_button() {
        mobilePage.buttonGoToShopping.click();
    }
    @Then("Tap on one of the products on the home page.")
    public void tap_on_one_of_the_products_on_the_home_page() {
        ReusableMethods.wait(2);
        mobilePage.imageMostPopularFirstProduct.click();
    }
    @Then("Tap on the size icon and {int} {int} {int} {int} {int} scroll page.")
    public void tap_on_the_size_icon_and_scroll_page(Integer x1, Integer y1, Integer wait, Integer xMove, Integer yMove) {
        ReusableMethods.wait(4);
        mobilePage.imageMostPopularFirstProductSize.click();
        ReusableMethods.scrollPage(x1,y1,wait,xMove,yMove);
    }
    @Then("Tap on the Add to Cart button.")
    public void tap_on_the_add_to_cart_button() {
        mobilePage.buttonAddToCart.click();
    }
    @Then("Tap on the Cart icon {int} {int}")
    public void tap_on_the_cart_icon(int xCoord,int yCoord) throws InterruptedException {
        ReusableMethods.clickCoordinate(xCoord,yCoord);
    }
    @Then("The remove icon appears next to the added products and it must be verified that it is active.")
    public void the_remove_icon_appears_next_to_the_added_products_and_it_must_be_verified_that_it_is_active() {
        mobilePage.methodDisplayedEnabled(mobilePage.iconRemoveProduct);
    }
    @Then("Verify that subtotal information is visible")
    public void verify_that_subtotal_information_is_visible() {
        mobilePage.methodDisplayed(mobilePage.textSubTotal);
    }
    @Then("Verify that the Prooceed to Checkout button is visible and active.")
    public void verify_that_the_prooceed_to_checkout_button_is_visible_and_active() {
        mobilePage.methodDisplayed(mobilePage.buttonProceedToCheckout);
    }
    @Given("Opens the app")
    public void opensTheApp() {getAppiumDriver();}
    @Given("Tap on the Query logo")
    public void tapOnTheQueryLogo() {
        mobilePage.logoQueryCard.click();}
    @When("Confirm that the site logo is visible")
    public void confirmThatTheSiteLogoIsVisible() {
        mobilePage.methodDisplayed(mobilePage.logoQueryCard);
    }
    @When("Verify that it is on the home page")
    public void verifyThatItIsOnTheHomePage() {
        mobilePage.methodDisplayed(mobilePage.linkHome);
    }
    @Given("Confirm that the logo is clickable on the homepage")
    public void confirm_that_the_logo_is_clickable_on_the_homepage() {
        ReusableMethods.wait(2);
        mobilePage.logoQueryCard.click();
        ReusableMethods.wait(2);
        mobilePage.methodDisplayed(mobilePage.logoQueryCard);
    }
    @When("Verify that the search box is visible")
    public void verify_that_the_search_box_is_visible() {
        mobilePage.methodDisplayed(mobilePage.searchBox);
    }
    @Then("Tap on the search box")
    public void tap_on_the_search_box() {
        mobilePage.searchBox.click();
    }
    @Then("Search for {string} and verify the relevant result")
    public void search_for_and_verify_the_relevant_result(String text) {
        mobilePage.clickAndSendKeys(mobilePage.textSearcBox,text);}
    @Given("Verify that the home link and category link is visible and active in the bottom bar of the site")
    public void verify_that_the_home_link_and_category_link_is_visible_and_active_in_the_bottom_bar_of_the_site() {
            mobilePage.methodDisplayedEnabled(mobilePage.linkHome);
            mobilePage.methodDisplayedEnabled(mobilePage.linkCategory);
    }
    @When("Verify that the wishlist, profile link is visible and active in the bottom bar of the site")
    public void verify_that_the_wishlist_profile_link_is_visible_and_active_in_the_bottom_bar_of_the_site() {
            mobilePage.methodDisplayedEnabled(mobilePage.linkWishlist);
            mobilePage.methodDisplayedEnabled(mobilePage.linkProfile);
    }
    @Then("Verify that the {int} {int} cart link is visible and active in the bottom bar of the site")
    public void verify_that_the_cart_link_is_visible_and_active_in_the_bottom_bar_of_the_site(Integer x, Integer y) throws InterruptedException {
        ReusableMethods.clickCoordinate(x,y);
    }
    @Given("Verify that products are visible in the most popular section on the homepage")
    public void verify_that_products_are_visible_in_the_most_popular_section_on_the_homepage() {
        mobilePage.methodDisplayed(mobilePage.textMostPopular);
    }
    @When("Tap the first product in the Most popular section")
    public void tap_the_first_product_in_the_most_popular_section() {
        mobilePage.imageMostPopularFirstProduct.click();
    }
    @Then("Verify that the price of the product is visible")
    public void verify_that_the_price_of_the_product_is_visible() {
        mobilePage.methodDisplayed(mobilePage.textFirstProductPrice);
    }
    @Then("Verify that the size of the product is visible")
    public void verify_that_the_size_of_the_product_is_visible() {
        mobilePage.methodDisplayed(mobilePage.imageMostPopularFirstProductSize);
    }
    @Then("Verify that the quantity of the product is visible")
    public void verify_that_the_quantity_of_the_product_is_visible() {
        mobilePage.methodDisplayed(mobilePage.textFirstProductQuantity);
    }
    @Then("Scroll page  {int} {int} {int} {int} {int}  Verify that product details section is visible")
    public void scroll_page_verify_that_product_details_section_is_visible(int x,int y,int wait,int xMove,int yMove) {
        ReusableMethods.scrollPage(x,y,wait,xMove,yMove);
        mobilePage.methodDisplayed(mobilePage.textFirstProductProductDetails);
    }
    @Then("Verify that the add to cart button is visible")
    public void verify_that_the_add_to_cart_button_is_visible() {
        mobilePage.methodDisplayed(mobilePage.buttonAddToCart);
    }
    @When("Choose the product size")
    public void choose_the_product_size() {
        mobilePage.imageMostPopularFirstProductSize.click();
    }
    @Then("Scroll page {int} {int} {int} {int} {int} and Tap on the Add to Cart icon.")
    public void scroll_page_tap_on_the_add_to_cart_icon(int x,int y,int wait,int xMove,int yMove) {
        ReusableMethods.scrollPage(x, y, wait, xMove, yMove);
        mobilePage.buttonAddToCart.click();
    }
    @Then("Verify that the subtotal is visible")
    public void verify_that_the_subtotal_is_visible() {
        mobilePage.methodDisplayed(mobilePage.textSubTotal);
    }
    @Then("Verify that the proceed the checkout button is visible and active")
    public void verify_that_the_proceed_the_checkout_button_is_visible_and_active() {
        mobilePage.methodDisplayed(mobilePage.buttonProceedToCheckout);
    }
    @Then("Tap on the proceed the checkout button")
    public void tap_on_the_proceed_the_checkout_button() {
        mobilePage.buttonProceedToCheckout.click();
    }
    @Given("Verify that the profile icon is visible in the bottom bar of the homepage")
    public void verify_that_the_profile_icon_is_visible_in_the_bottom_bar_of_the_homepage() {
        mobilePage.methodDisplayed(mobilePage.linkProfile);
    }
    @Then("Tap on Sıgn Up button")
    public void tapOnSıgnUpButton() {
        mobilePage.buttonSignUp.click();
    }
    @Then("Verify that name textbox is visible")
    public void verify_that_name_textbox_is_visible() {
       mobilePage.methodDisplayed(mobilePage.textBoxNameSignUp);
    }
    @Then("Verify that use email instead text is visible")
    public void verify_that_use_email_instead_text_is_visible() {
        mobilePage.methodDisplayed(mobilePage.textUseEmail);
    }
    @Then("Tap the use email instead text")
    public void tap_the_use_email_instead_text() {
        mobilePage.textUseEmail.click();
    }
    @Then("Verify that email textbox is visible")
    public void verify_that_email_textbox_is_visible() {
        mobilePage.methodDisplayed(mobilePage.textBoxEmailSignUp);
    }
    @Then("Tap the use phone instead text")
    public void tap_the_use_phone_instead_text() {
        mobilePage.textUsePhone.click();
    }
    @Then("Verify that phone textbox is visible")
    public void verify_that_phone_textbox_is_visible() {
        mobilePage.methodDisplayed(mobilePage.textBoxPhoneSignUp);
    }
    @Then("Verify that password textbox is visible")
    public void verify_that_password_textbox_is_visible() {
        mobilePage.methodDisplayed(mobilePage.textBoxPasswordSignUp);
    }
    @Then("Empty the name phone password textboxes and tap the sign Up button.")
    public void empty_the_name_phone_password_textboxes_and_tap_the_sign_up_button() {
        mobilePage.buttonSignUpRegister.click();
    }
    @Then("Verify that there are areas that cannot be left empty")
    public void verify_that_there_are_areas_that_cannot_be_left_empty() {
        mobilePage.methodDisplayed(mobilePage.messageThisFieldIsRequired);
    }
    @Then("Enter {string} in name textbox")
    public void enter_in_name_textbox(String name) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxNameSignUp,name);
    }
    @Then("Enter a number less than '7' characters {string} in the phone textbox")
    public void enter_a_number_less_than_characters_in_the_phone_textbox( String phone) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxPhoneSignUp,phone);
    }
    @Then("Enter {string} in password textbox tap the sign Up button.")
    public void enter_in_password_textbox_tap_the_sign_up_button(String password) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxPasswordSignUp,password);
    }
    @Then("Verify that less than '7' characters error message is displayed")
    public void verify_that_less_than_characters_error_message_is_displayed() {
        mobilePage.methodDisplayed(mobilePage.messageRequiredPhoneSignUp);
    }
    @Then("Enter {string} in the mail textbox")
    public void enter_in_the_mail_textbox(String email) {
        mobilePage.textBoxEmailSignUp.click();
        mobilePage.textBoxEmailSignUp.clear();
        ReusableMethods.typeWithKeyBoard(email);
    }
    @Then("Verify that the error message is visible")
    public void verify_that_the_error_message_is_visible() {
        mobilePage.methodDisplayed(mobilePage.messageEmailSignUp);
    }
    @Then("Verify that the mail is available")
    public void verify_that_the_mail_is_available() {
        assertFalse(mobilePage.messageEmailSignUp.isDisplayed());
    }

}
