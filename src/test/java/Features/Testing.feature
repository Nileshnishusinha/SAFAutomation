Feature: Testing GoIbibo Website

  Background:
    Given Browser "Chrome" is launched

  @TC_01
  Scenario Outline: Validate the title of the website
    And Navigate to "<Website>" page
#    And Navigate to "<Website1>" page
    Then Validate the expected title as "<Expectedtitle>"
    And Close Browser
    Examples:
      | Website                  | Website1                  | Expectedtitle                                                                               |
      | https://www.goibibo.com/ | https://www.facebook.com/ | Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off |


  @TC_02
  Scenario: Validate the Screen Recording testing of the website
#    Given Testing of the Screen Recording feature
    And Close Browser

