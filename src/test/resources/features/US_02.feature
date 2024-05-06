Feature: US02
@us02-1
  Scenario Outline: TC01

    Given Tap on the Query logo
    When Verify that it is on the home page
    Then Verify that the search box is visible
    Then Tap on the search box
    Then Search for "<text>" and verify the relevant result

    Examples:
      | text  |
      | shoes |

  @us02-2
  Scenario Outline: TC02

    Given Verify that the "Home" link is visible and active
    Given Verify that the "Category" link is visible and active
    Given Verify that the "Wishlist" link is visible and active
    Given Verify that the "Profile" link is visible and active
    Then Verify that the <x> <y> cart link is visible and active in the bottom bar of the site

    Examples:
      | x   | y    |
      | 534 | 2059 |