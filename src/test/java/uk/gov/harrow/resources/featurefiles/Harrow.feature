Feature: Harrow Group Study Test Sample
  As a user I want to navigate to login page

  Scenario: User should navigate to login page successfully
    Given I am on Home page
    When I click on login or register link
    Then I should navigate to login page successfully

  Scenario: User should not able to log in with invalid credentials
    Given I am on Home page
    When I click on login or register link
    And I enter email "abc@gmail.com"
    And I enter password "xyz123"
    And I click on Login button
    Then I should see error massage "Invalid Username/Password supplied"

