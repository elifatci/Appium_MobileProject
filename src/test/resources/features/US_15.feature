Feature: US15

  @us15
  Scenario: TC01

    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.
    Then Tap on Profile link
    Then Verify that the "Order History" menu title is visible and active in the Dashboard sideBar.
    Then Tap on the "Order History" menu heading.
    Then Verify that the Shopping history viewing icon is visible
    Then Tap on the Shopping history viewing icon
    Then Tap the "Download Receipt"
    Then Verify that the "Print Invoice" is visible