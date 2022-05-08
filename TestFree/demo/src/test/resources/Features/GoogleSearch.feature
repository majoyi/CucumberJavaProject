Feature: Features to test google search

  Scenario: Validate google searh is working
    Given Browser is open
    And User is on google search box
    When User enters text a text search box
    And Hits enter
    Then User is navigated to search results
