Feature: Connect with Us
  So that clients can connect with FruitionConsult
  As an Admin
  I want a form that can enable clients to submit their details


  Scenario: Verify error message is displayed when empty form is submitted
    Given I navigate to fruitionConsult homepage
    When I click on "Connect With Us" tab
    And I click on submit button
    Then an error message is displayed