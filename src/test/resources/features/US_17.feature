@us17
Feature:US17

  Background:

    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.
    Then Tap on Profile link

  Scenario: TC01

    Given Verify that the "Change Password" menu is visible and active
    When Close the app

  Scenario:TC02

    Given Tap the "Change Password"
    When Verify that the "Old Password" is visible
    Then Verify that the "New Password" is visible
    Then Verify that the "Confirm Password" is visible
    Then Verify that the "Save Changes" button is visible and active
    Then Close the app

  Scenario Outline:TC03
    Given Tap the "Change Password"
    Then Enter "<old password>" in the old password textbox
    Then Enter "<new password>" in the new password textbox
    Then Enter "<confirm password>" in the confirm password textbox
    Then Tap the "Save Changes"
    Then Verify that the successfully replaced message is displayed.
    Then Close the app
    Examples:
      | old password | new password | confirm password |
      | Query.2904   | E.121212     | E.121212         |