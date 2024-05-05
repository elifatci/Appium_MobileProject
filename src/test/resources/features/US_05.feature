Feature:

  @us05-1
  Scenario: TC01
    Given Tap on Profile link
    When Verify that the sign in button is visible and active
    Then Tap on Sıgn In button
    Then Verify that the Remember me checkBox is selectable
    Then Verify forget password link is visible
    Then Tap on the forget password link
    Then Verify that it redirects to the forget password page

  @us05-2
  Scenario:
    Given Tap on Profile link
    When Tap on Sıgn In button
    Then Verify signUp link is visible
    Then Tap on the signUp link
    Then Verify that it redirects to the register page

  @us05-3
  Scenario Outline:
    Given Tap on Profile link
    When Tap on Sıgn In button
    Then Enter "<invalid phone>" in the phone textbox
    Then Enter "<invalid password>" in the password textbox
    Then Tap on the signIn button and verify that you can't sign in.


    Examples:
      | invalid phone | invalid password |
      | 09080908      | 1234567          |

  @us05-4
  Scenario Outline:
    Given Tap on Profile link
    When Tap on Sıgn In button
    Then Enter "<valid phone>" in the phone textbox
    Then Enter "<valid password>" in the password textbox
    Then Tap on the signIn button and verify that you're signed in.

    Examples:
      | valid phone | valid password |
      | 9999999999  | Query.2904     |