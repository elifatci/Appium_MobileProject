Feature: US22

  Background:
    Given Tap on Profile link
    When Tap on Sıgn In button
    Then You can access the page with "phoneNumber", "password" valid information.
    Then Tap on Profile link
    Then Tap the "Order History"
    Then Tap the order that has been delivered
    Then Scroll down the page

  Scenario:TC01

    Then Verify that the "Return Request" button is visible and active
    Then Tap the "Return Request"
    Then Verify that the "Request Return" button is visible and active
    Then Close the app

    Scenario: TC02

      Then Tap the "Return Request"
      Then Select product
      Then Select "Other" option from the Return Reason
      Then Scroll down the page
      Then Enter "It's too big. I didn't like it." note in the return note section
      Then Tap the "Request Return"
      Then Verify that the successfully replaced message is displayed.