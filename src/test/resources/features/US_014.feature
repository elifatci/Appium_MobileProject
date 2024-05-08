Feature: US14

  Background:

    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.
    Then Tap on Profile link

  @us14-1
  Scenario:TC01

    Then Verify that the "Address" menu title is visible and active in the Dashboard sideBar.
    Then Tap on the "Address" menu heading.
    Then It must be verified that the addresses registered on the address page are visible.
    Then Verify that the edit icon and delete icon are visible and active in the registered addresses section.
    Then Verify that registered addresses are editable
    Then It must be verified that registered addresses can be deleted.

  @us14-2
  Scenario Outline: TC02 Positive test

    Then Tap on the "Address" menu heading.
    Then Tap Add New Address button will appear and verify that it is active.
    Then Tap on the Add new address button.
    Then Valid information is entered in the "<fullName>" and "<email>" textboxes.
    Then The "<phoneNumber>" is entered by selecting the country code from the phone textbox.
    Then Relevant options are selected from country status and city dropdowns.
    Then The relevant "<zipcode>" is entered into the zip code textbox.
    Then The relevant address is entered in the "<street>" textbox.
    Then Tap on the Add address button
    Then It must be verified that the address has been added.

    Examples:
      | fullName | email       | phoneNumber | zipcode | street |
      | Elif     | 12@gmail.cm | 12345       | 12345   | 12345  |

  @us14-3
  Scenario Outline: TC03 Negative test

    Then Tap on the "Address" menu heading.
    Then Tap on the Add new address button.
    Then It should be verified that the error message is visible when the full name is empty
    Then It should be verified that the error message is visible when the phone is empty.
    Then It should be verified that the error message is visible when the street address is empty.
    Then Valid information is entered in the "<fullName>" and "<phone>" textbox.
    Then Scroll down the page
    Then Valid information is entered in the "<street>" textbox.
    Then Tap on the Add address button


    Examples:
      | fullName | phone | street |
      | Elif     | 12345 | 123    |