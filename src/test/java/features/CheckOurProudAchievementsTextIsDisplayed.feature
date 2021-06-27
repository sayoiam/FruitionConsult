Feature: Our Proud Achievements Text
  So that the achievement of FruitionConsult is highlighted
  As an admin
  I want a section to be title Our Proud Achievement

  Scenario Outline: Our Proud Achievement is displayed
    Given I navigate to fruitionConsult homepage
    When I click on "<TabTitle>" tab
    Then "<SectionTitle>" is displayed

    Examples: Test Data
    |TabTitle    |SectionTitle          |
    |Case Studies|Our Proud Achievements|
