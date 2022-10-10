Feature: Login to test

  Scenario: User is login successfully
    Given User is login page
    When User enter username and password
    And Click on login button
    Then User is navigate to home page
