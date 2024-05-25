Feature: US23

  Background:
    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.


  Scenario: TC01

    Given Verify that the "Category" link is visible and active
    When Tap on the "Category" link
    Then Tap on the "Women" link
    Then Tap on the "Women Shoes" link
    Then Verify that the favorite icon is visible on the product.
    Then Tap on the favorite icon
    Then Verify that it has been added to the favorites list.

  @2301
  Scenario: TC02

    Given Verify that the "Wishlist" link is visible and active
    When Tap on the "Wishlist" link
    Then Verify that the product is visible on the wishlist
    Then Remove the item from the wishlist.
    Then Verify that the product has been removed