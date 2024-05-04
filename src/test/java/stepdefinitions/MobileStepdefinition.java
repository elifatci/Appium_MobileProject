package stepdefinitions;

import page.Base;
import page.MobilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.ReusableMethods;
import java.net.MalformedURLException;
import static org.junit.Assert.assertTrue;

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
    public void ıt_must_be_verified_that_the_addresses_registered_on_the_address_page_are_visible() {
        mobilePage.methodDisplayed(mobilePage.iconFirstEdit);
    }
    @Then("Verify that the edit icon and delete icon are visible and active in the registered addresses section.")
    public void verify_that_the_edit_icon_and_delete_icon_are_visible_and_active_in_the_registered_addresses_section() {
        mobilePage.methodDisplayedEnabled(mobilePage.iconFirstRemove);
    }
    @Then("Verify that registered addresses are editable")
    public void verify_that_registered_addresses_are_editable() throws InterruptedException {

    }
    @Then("It must be verified that registered addresses can be deleted.")
    public void ıt_must_be_verified_that_registered_addresses_can_be_deleted() {
        mobilePage.iconFirstRemove.click();
        mobilePage.buttonDelete.click();
        assertTrue(mobilePage.messageDeleteSuccess.isDisplayed());
    }
    @Then("Tap Add New Address button will appear and verify that it is active.")
    public void tap_add_new_address_button_will_appear_and_verify_that_it_is_active() {
        mobilePage.methodDisplayedEnabled(mobilePage.buttonAddNewAddress);
    }

    @Then("Tap on the Add new address button.")
    public void tap_on_the_add_new_address_button() {
        mobilePage.buttonAddNewAddress.click();
        ReusableMethods.wait(2);
    }

    @Then("Valid information is entered in the {string} and {string} textboxes.")
    public void valid_information_is_entered_in_the_and_textboxes(String name, String email) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressFullName, name);
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressEmail, email);
    }

    @Then("The {string} is entered by selecting the country code from the phone textbox.")
    public void the_is_entered_by_selecting_the_country_code_from_the_phone_textbox(String phone) {
        mobilePage.clickAndSendKeys(mobilePage.textBoxAddressPhone, phone);
    }

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


}
