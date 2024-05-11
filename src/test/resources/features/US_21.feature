Feature:US21

  Background:

    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.
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
    
  Scenario Outline: TC01
    
    Then Verify that the "Confirm Order" button is visible and active
    Then Tap the "Confirm Order"
    Then Enter valid "<Card Number>" "<Card Date>" "<CVC Code>" and "<ZIP Code>" in card textbox
    # confirm button loctae is text
    Then Tap the "Confirm" button
    Then Verify that the "Thank you for your order! Your order is confirmed." section is visible
    Then Verify that the "Go to order details" button is visible and active
    Then Verify that the "Go to shopping" button is visible and active
    Then Close the app

    Examples:
      | Card Number      | Card Date | CVC Code | ZIP Code |
      | 4242424242424242 | 1127      | 123      | 11111    |

  Scenario Outline: TC02
    
    Then Tap the "Confirm Order"
    Then Enter valid "<Card Number>" "<Card Date>" "<CVC Code>" and "<ZIP Code>" in card textbox
    Then Tap the "Confirm" button
    Then Tap the "Go to order details"
    Then Verify that the "Order History" section is visible
    Then Verify that the "Order Details and invoice" section is visible
    Then Close the app

    Examples:
      | Card Number      | Card Date | CVC Code | ZIP Code |
      | 4242424242424242 | 1127      | 123      | 11111    |

    Scenario Outline: TC03

      Then Tap the "Confirm Order"
      Then Enter valid "<Card Number>" "<Card Date>" "<CVC Code>" and "<ZIP Code>" in card textbox
      Then Tap the "Confirm" button
      Then Tap the "Go to shopping"
      Then Verify that it's on the homepage

      Examples:
        | Card Number      | Card Date | CVC Code | ZIP Code |
        | 4242424242424242 | 1127      | 123      | 11111    |


