Feature: US10

  @us10
  Scenario Outline: TC01

    Given Tap the "Category"
    When Tap the "Men"
    Then Verify that the filter icon is visible and active
    Then Select the product with the description "<description>"
    Then Tap on the size icon "L"
    Then Tap the "Add to Cart"

    Examples:
      | description         |
      | Waterproof Raincoat |