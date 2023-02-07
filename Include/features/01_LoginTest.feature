Feature: Login test

  @Smoke
  Scenario: Verify Login fnuctionality with valid credentials
    Given user is on login screen
    When user enters the valid username and password
    And clicks on login button
    Then user navigated to homepage


    