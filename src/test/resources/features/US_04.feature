Feature: US04

  @us04-1
  Scenario: TC01

    Given Verify that the profile icon is visible in the bottom bar of the homepage
    When Tap on Profile link
    Then Tap on Sıgn Up button
    Then Verify that name textbox is visible
    Then Verify that use email instead text is visible
    Then Tap the use email instead text
    Then Verify that email textbox is visible
    Then Tap the use phone instead text
    Then Verify that phone textbox is visible
    Then Verify that password textbox is visible

  @us04-2
  Scenario Outline: TC02 In order to register with phone number, it must be mandatory to enter at least 7 digit number.
    Given Tap on Profile link
    When Tap on Sıgn Up button
    Then Empty the name phone password textboxes and tap the sign Up button.
    Then Verify that there are areas that cannot be left empty
    Then Enter "<valid name>" in name textbox
    Then Enter a number less than '7' characters "<invalid phone>" in the phone textbox
    Then Enter "<valid password>" in password textbox tap the sign Up button.
    Then Verify that less than '7' characters error message is displayed

    Examples:
      | valid name | invalid phone | valid password |
      | Test       | 12345         | Test_23        |

  @us04-3
  Scenario Outline: TC03 The email entered for email entry must meet the valid email criteria

    Given Tap on Profile link
    When Tap on Sıgn Up button
    Then Enter "<valid name>" in name textbox
    Then Tap the use email instead text
    Then Enter "<invalid mail>" in the mail textbox
    Then Verify that the error message is visible
    Then Enter "<valid mail>" in the mail textbox
    Then Verify that the mail is available


    Examples:
      | valid name | invalid mail | valid mail   |
      | Test       | testgml.com  | test@gml.com |

  @us04-4
  Scenario Outline:TC04

    Given Tap on Profile link
    When Tap on Sıgn Up button
    Then Enter "<valid name>" in name textbox
    Then Enter "<valid phone>" in phone textbox
    Then Enter less than 6 characters "<invalid password>" in the password textbox
    Then Verify that the warning message is visible
    Then Verify that the sign In link is visible
    Then Tap on the sign In link

    Examples:
      | valid name | valid phone | invalid password |
      | Test       | testgml.com | 123              |
