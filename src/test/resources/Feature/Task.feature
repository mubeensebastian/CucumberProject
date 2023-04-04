Feature: verifying omrbranch login details

  Scenario: verifying omrbranch login with valid data
    Given user is on the omr branch page
    When user enters username and password
    And user click login button
    Then user should verify after login success message
