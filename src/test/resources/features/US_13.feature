Feature:US13


  @us13
  Scenario:TC01


    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.
    Then Tap on Profile link
    Then Verify that the dashboard page is visible
    Then Verify that the "My Account" is visible
    Then Tap on "My Account" menu
    Then Verify that the "Total Orders" is visible
    Then Verify that the "Order History" is visible