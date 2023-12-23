Feature: Students Page Validation

  @student
  Scenario: Validate all SubTabs
    When I logged in
    And I click to the Students Tab
    Then I validate all the tabs in student page
      | Personal             |
      | Parental             |
      | Academic             |
      | Override Final Grade |
      | Schedule             |
      | Discipline Stats     |
      | Personal 2           |
      | Enrollment           |
      | Notes                |
      | E-Portfolio          |
      | Program Enrollment   |
