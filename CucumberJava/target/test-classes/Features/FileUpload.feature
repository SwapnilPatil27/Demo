Feature: File Uploading

  Scenario: Verify the File is uploading or not
    Given that the user is on upload file screen.
    When a user clicks on the Browse button.
    And user enters <filename> onto the upload textbox.
    And user clicks on the enter button.
    Then verify that the file upload is successful

  Scenario Outline: 
    |filename|
    |file1|
    |file2|

