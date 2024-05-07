Feature: US10

  @us10
  Scenario Outline: TC01

    Given Tap the "Men" heading under Categories
    When Verify that the filter icon is visible and active
    Then Select the product with the description "<description>"
    Then Tap on the size icon "L"
    Then Tap on the Add to Cart button.

    Examples:
      | description         |
      | Waterproof Raincoat |