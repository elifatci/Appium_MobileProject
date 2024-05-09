Feature: US03

  @us03-1
  Scenario: TC01

    Given Verify that products are visible in the most popular section on the homepage
    When Tap the first product in the Most popular section
    Then Verify that the price of the product is visible
    Then Verify that the size of the product is visible
    Then Verify that the quantity of the product is visible
    Then Scroll page Verify that product details section is visible
    Then Verify that the add to cart button is visible


  @us03-2
  Scenario:
    Given Tap the first product in the Most popular section
    When Choose the product size
    Then Scroll page and Tap on the Add to Cart button.
    Then Tap on the Add to Cart icon
    Then Verify that the subtotal is visible
    Then Verify that the proceed the checkout button is visible and active
    Then Tap on the proceed the checkout button

