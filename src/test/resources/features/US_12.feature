Feature: US12

  @us12
  Scenario Outline: TC01

    Given Tap the "Category"
    When Tap the "Women"
    Then Verify that the filter icon is visible and active
    Then Select the product with the description "<description>"
    Then Tap on the color icon "Black"
    Then Tap the "Add to Cart"

    Examples:
    |description|
    |Clarks Originals Shoes|