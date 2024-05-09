Feature:US18

  @us18
  Scenario Outline:TC01

    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.
    Then Tap on Profile link
    Then Verify that the "Edit Profile" menu is visible
    Then Tap on the "Edit Profile" link
    Then Verify that the "Save Changes" button is visible and active.
    Then Full "<newName>" information is updated
    Then Tap the "Save Changes"
    Then Verify that the successfully replaced message is displayed.

    Examples:
      | newName |
      | Elif    |