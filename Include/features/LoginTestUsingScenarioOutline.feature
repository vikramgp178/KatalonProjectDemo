Feature: Login test using Scenario Outline

  @sanity
  Scenario Outline: Verify Login fnuctionality with valid credentials using Scenario Outline
    Given user is on login screen
    When user enters the valid <username> and <password> test
    And clicks on login button
    Then user navigated to homepage

   
    Examples: 
      | username | password |
      | Admin    | admin123 |
