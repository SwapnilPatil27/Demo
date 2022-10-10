Feature: Login Functionality Feature

  Scenario Outline: Login Functionality
  
    Given user navigates to SOFTWARETESTINGHELP.COM
    When user logs in using Username as <username> and Password <password>
    Then login should be successful
    
      | username | password  |
      | Tom      | password1 |
      | Harry    | password2 |
      | Jerry    | password3 |
