Feature: fgfgn TEst Guru99
  @SmokeTest
  Scenario: Open Browser and
    Given Chrome Browser is open Navigate to Url:"http://demo.guru99.com/"
    When Click on Telecom header
    Then Click Add Members
    Given Client details Name :"Test", Surname :"Test" , Email :"test@gmail.com" and Address:"3554 1 Line test".
## Then Click on login button
# And Click login  I complete action
# Then User is navigated to Home page