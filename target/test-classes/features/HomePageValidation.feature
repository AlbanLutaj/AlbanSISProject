
Feature: Home Page Validation

  @dashboard
  Scenario: Succesfully Login and home page validation
   
   When I logged in
   Then I validate that i logged in
   Then I validate the Announcment section i visible
   Then I validate the url includes the "MainPage.aspx" extension

  