Feature:US19

  @us19
  Scenario:TC01

    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.
    Then Tap on Profile link
    Then Verify that the "Logout" menu is visible and active
    Then Tap on "Logout" menu
    Then Verify that the user is logout