Feature: Feature to test google search

  Scenario: Validate the Google Search is working
    Given Browser is open
    And user is on search page
    When user is enter text in search box
    And hits enter
    Then user is navigated to search results
  