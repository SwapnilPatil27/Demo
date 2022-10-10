Feature: Facebook Login

  Scenario: Valaidate User is Login to Facebook
  
    When I go to the home page
    And I press Connect your Facebook account
    And I fill in 8806897397 for Email
    And I fill in 8806897397 for Password
    And I press Login
    Then I should be on the dashboard page
