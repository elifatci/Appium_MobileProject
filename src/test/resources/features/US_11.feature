Feature:US11

  Scenario Outline:TC01

    Given Tap the "Category"
    When Tap the "Juniors"
    Then Verify that the filter icon is visible and active
    Then Select the product with the description "<description>"
    Then Tap on the color icon "Green"
    Then Tap the "Add to Cart"

    Examples:
      | description       |
      | JUNIOR SCHOOL BAG |