Feature: Home Page Validation

  @dashboard
  Scenario: Succesfully Login and home page validation
    When I logged in
    Then I validate that i logged in
    Then I validate the Announcment section i visible
    Then I validate the url includes the "MainPage.aspx" extension

  @ValidateAss
  Scenario: Validate Assignement Tab
    When I logged in
    And I click to Staff/Faculty
    And I click to assignment
    Then I validate the page

  @ValidateUserLogin
  Scenario: ValidateStudentUserLogin
    When I enter username
    And I enter password
    And I click to Login
    Then I validate student information

  @ValidateParentUserLogin
  Scenario: ValidateParentUserLogin
    When I enter username
    And I enter password
    And I click to Login
    Then I validate parent information
      | Main Page            |
      | Attendance           |
      | Grades               |
      | Homework             |
      | Results              |
      | Schedule             |
      | Discipline           |
     
    
    @ValidateTeacherUserLogin
  Scenario: ValidateTeacherUserLogin
    When I enter username
    And I enter password
    And I click to Login
    Then I validate teacher information
