@tag
Feature: Telecom
  I want to use this template for my feature file

  #@tag1
  #Scenario: Add Customer feature - 2-D Map
  # Given User in telecom home page
  #And User click on Add customer option
  # When User fill all the fields...
  #| fname  | lname    | email            | address | mobile   |
  #| Deepak | Jayaraam | deepak@gmail.com | OMR     | 12345678 |
  #| Thiru  | Jayaraam | deepak@gmail.com | OMR     | 12345678 |
  #And User click on submit button
  #Then User is generated with customer id1
  @tag2
  Scenario Outline: Add Tariff Plan feature
    Given User in telecom home page
    And User click on Add Tariff Plan
    When User fill all the fields
      | 120 | 500 | 200 | 100 | 200 | 300 | 400 |
    And User click on Submit button
    Then User will be added with tariff plan
