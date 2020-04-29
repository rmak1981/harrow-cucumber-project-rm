Feature: Services function
  As a user I want to check services on Harrow website

  Scenario: User should navigate to services page successfully

    Given I am on Home page
    When I click on services button
    Then I should navigate to services page successfully

  Scenario: Verify text when user closes services page
    Given I am on Home page
    When I click on services button
    And I should navigate to services page successfully
    And I click on close button
    Then I should see "SERVICES" text