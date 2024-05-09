@us16
Feature:US16

  Background:

    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.
    Then Tap the first product in the Most popular section
    Then Choose the product size
    Then Scroll page and Tap on the Add to Cart button.
    Then Tap on the Add to Cart icon
    Then Tap on the proceed the checkout button


  Scenario: TC01

    Given Verify that the "Delivery" button is visible and active
    When Verify that the "Pick Up" button is visible and active
    Then Tap the "Delivery"
    Then Verify that the "Shipping Address" is visible
    Then Verify that the "Edit" button is visible and active
    Then Tap on the "Edit" button
    Then Verify that registered addresses are editable
    Then Close the app

    Scenario: TC02

      Given Scroll down the page
      When Verify that the "Order Summary" is visible
      Then Verify that the "Save & Pay" button is visible and active
      Then Close the app