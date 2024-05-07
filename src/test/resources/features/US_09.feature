Feature: US09

  @us09
  Scenario: TC01

    Given Tap the first product in the Most popular section
    When Verify that the "Details" link is visible and active
    Then Verify that the "Videos" link is visible and active
    Then Verify that the "Review" link is visible and active
    Then Verify that the "Shipping & Return" link is visible and active
    Then Tap on the "Details" link
    Then Verify that the "Product Details" section is visible
    Then Tap on the "Videos" link
    Then Verify that the "Product Videos" section is visible
    Then Tap on the "Review" link
    Then Verify that the "Product Reviews" section is visible
    Then Tap on the "Shipping & Return" link
    Then Verify that the "Shipping & Return" section is visible