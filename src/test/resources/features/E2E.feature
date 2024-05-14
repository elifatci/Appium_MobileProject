@E2E
Feature:

  Scenario Outline:
    Given Tap on Profile link
    And Tap on Sıgn In button
    When You can access the page with "phoneNumber", "password" valid information.
    Then Tap the first product in the Most popular section
    Then Choose the product size
    Then Scroll page and Tap on the Add to Cart button.
    Then Tap on the Add to Cart icon
    Then Tap on the proceed the checkout button
    Then Select the first address
    Then Scroll down the page
    Then Tap the "Save & Pay"
    Then Verify that the "Select Payment Method" section is visible
    Then Tap the "Stripe"
    Then Verify that the "Confirm Order" button is visible and active
    Then Tap the "Confirm Order"
    Then Enter valid "<Card Number>" "<Card Date>" "<CVC Code>" and "<ZIP Code>" in card textbox
    Then Tap the "Confirm" button
    Then Close the app

    Examples:
      | Card Number      | Card Date | CVC Code | ZIP Code |
      | 4242424242424242 | 1127      | 123      | 11111    |