Feature: exercise page

Background:



  Scenario:
    Given Get Chrome browser
    When Navigate to Url     
    Then Verify right count of values appeared on the screen
    And Verify values on the screen are greater than 0
    And Verify total balance matches sum of values
    And Verify values are formatted as currencies
 
    