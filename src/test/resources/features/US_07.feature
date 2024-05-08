Feature: US07

  @us07
  Scenario: TC01

    Given Verify that the most popular menu title is visible
    When Verify that the "See All" link is visible and active
    Then Tap on the "See All" link
    Then User displays current product lists under most popular title
    Then Verify that the back icon is visible
    Then Tap on the back icon
    Then Verify that it's on the homepage