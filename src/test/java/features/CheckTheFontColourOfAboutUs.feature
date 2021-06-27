Feature: Font Colour
  So that the company colour code is maintained
  As an Admin
  I want the paragraph of About Us to be a dark shade of Cyan-blue

  Scenario Outline: Verify the font colour of About Us paragraph
    Given I navigate to fruitionConsult homepage
    When I click the toggle bar
    And I click on "<TabTitle>" tab
    Then the font colour of the paragraph should be "<Colour>"

    Examples: Test Data
    |TabTitle |Colour   |
    |About Us |#163246  |