

Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials

    Given User is on login page
    When User enters username and password
    And Clicks on login button
    Then User is navigated to homepage

# Scenario Outline: Means whenever we have to parametrize the scenario with data






