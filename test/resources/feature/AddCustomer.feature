@tag
Feature: Telecom feature
  I want to use this template for my feature file

  @tag1
  Scenario: Add Customer feature
    Given User in telecom home page
    And User click on Add customer option
    When User fill all the fields.
    |Deepak|Jayaraam|deepak@gmail.com|OMR|12345678|
    And User click on submit button
    Then User is generated with customer id

    