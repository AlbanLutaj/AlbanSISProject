Feature: Add New Student

  @addNew
  Scenario: Validate Student created
    When I logged in
    And I click to the Students Tab
    When I click on Add Student
    And I filed up all the section except local id, grade section, and username
    Then i Validate success message displayed indicating student is created

  @enroll
  Scenario: Validate student functionality and enrollment
    When I logged in
    And I click to the Students Tab
    And I select new as status and send the name of the new student
    When I click the enroll
    Then I verity the status of enrollment

  @addNewParent
  Scenario: Add New Parent
    When I logged in
    And I click to the Students Tab
    When I select new as status and send the name of the new student
    When I click to Parental
    And I click add primary Parent
    Then I fil up the primary parent form and save it
    And I click add secondary Parent
    And I fill up the secondary parent form and save it

  @addNewTeacher
  Scenario: Add New Teacher
    When I logged in
    And I click to Staff/Faculty
    When I click Add New
    And I select Job Position annd Access Level
    Then I fill up the form
