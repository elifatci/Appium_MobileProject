Feature: US20

  Background:

    Given Tap on Profile link
    When Tap on Sıgn In button


  Scenario: TC01

    Then Verify that the "Forgot Password" link is visible and active
    Then Tap the "Forgot Password"
    Then Verify that the "Get OTP" button is visible and active
    Then Verify that the "Back to sign in" link is visible and active
    Then Close the app

  Scenario Outline: TC02

    Then Tap the "Forgot Password"
    Then Enter "<valid phone>" in phone textbox
    Then Tap the "Get OTP"
    Then Verify that the successfully replaced message is displayed.
    Then Verify that the new password is visible
    Then Verify that the confirm password is visible
    Then Verify that the "Submit" button is visible and active
    Then Enter "<new pass>" in new password textbox
    Then Enter "<confirm pass>" in confirm password textbox
    Then Tap the "Submit"
    Then Verify that it's on the homepage

    Examples:
      | valid phone | new pass | confirm pass |
      | 9999999999  | E.121212 | E.121212     |
