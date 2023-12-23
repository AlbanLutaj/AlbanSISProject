Feature: Login functionality

  @smoke
  Scenario: Positive Login Page Validation
    When I enter username
    And I enter password
    And I click to Login
    Then I validate that i logged in

  @smoke
  Scenario: Blank Password
    When I enter username
    And I leave the field empty
    And I click to Login
    Then I validate that password cannot be empty

  @smoke
  Scenario: Wrong Credentials
    When I enter username
    And I enter wrong credentials
    And I click to Login
    Then I validate that password doesnt match
