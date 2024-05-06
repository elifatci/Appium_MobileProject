Feature: US06

  @us06
  Scenario: TC01

    Given Verify that the "Category" link is visible and active
    When Tap on the "Category" link
    Then Verify that "Men" "Women" "Juniors" subheadings are visible and active
    Then Tap on the "Women" link
    Then Tap on the "Women Shoes" link
    Then Verify that the filter icon is visible and active