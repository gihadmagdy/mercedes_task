Feature: feature to test search functionality

  Scenario Outline: Check user can search for mercedes on google
    Given  user is on google
    When user enters "<carname>"
    Then click search
    Then choose the  first link
    And  assert on power output

    Examples:
    |carname|
    |Mercedes A Class|