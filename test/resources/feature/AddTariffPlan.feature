@tag
Feature: Telecom
  I want to use this template for my feature file

  @tag1
  Scenario: Add Customer feature
    Given User in telecom home page
    And User click on Add customer option
    When User fill all the fields.
      | Deepak | Jayaraam | deepak@gmail.com | OMR | 12345678 |
    And User click on submit button
    Then User is generated with customer id

  @tag2
  Scenario Outline: Add Tariff Plan feature
    Given User in telecom home page
    And User click on Add Tariff Plan
    When User fill all the fields"<MonthlyRental>","<FreeLocalMinutes>","<FreeInternationalMinutes>","<FreeSMSPack>","<LocalCharges>","<InternationalCharges>","<SMSCharges>"
    And User click on Submit button
    Then User will be added with tariff plan

    Examples: 
      | MonthlyRental | FreeLocalMinutes | FreeInternationalMinutes | FreeSMSPack | LocalCharges | InternationalCharges | SMSCharges |
      |           120 |              500 |                      200 |         100 |          200 |                  300 |        400 |
