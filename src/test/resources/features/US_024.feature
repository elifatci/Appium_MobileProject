Feature: US24

  Background:
    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.

  @us24-1
  Scenario Outline: TC01

    Then Tap on the cart icon <x> <y>
    Then Verify that you are directed to the relevant page.
    Then If there are no items in the cart, the Go to Shopping button will appear and it must be verified that it is active.

    Examples:
      | x   | y    |
      | 534 | 2059 |

  @us24-2
  Scenario Outline: TC02

    Then Tap on the cart icon <x> <y>
    Then Tap on Go to Shopping button
    Then Tap on one of the products on the home page.
    Then Tap on the size icon and scroll page.
    Then Tap the "Add to Cart"
    Then Tap on the Cart icon <xCoord> <yCoord>
    Then The remove icon appears next to the added products and it must be verified that it is active.
    Then Verify that subtotal information is visible
    Then Verify that the Prooceed to Checkout button is visible and active.

    Examples:
      | x   | y    | xCoord | yCoord |
      | 534 | 2059 | 959    | 2155   |


