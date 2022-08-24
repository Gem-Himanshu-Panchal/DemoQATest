@all
Feature: Test
  @TestCucumber
  Scenario: Test all dependencies
    Then run fun1
    Then run fun2
    And run fun3

    @First
    Scenario Outline: First automation testcase script for DemoQA website
      Then Setup Environment and open chrome
      And Search for DemoQA website in chrome tab
      Then Click on Elements button
      And Click on Text button present below Element dropdown
      Then Fill the details "<name>","<email>","<currentAddress>","<permanentAddress>"
      And Click on Submit button
      And Verify if "<name>","<email>","<currentAddress>","<permanentAddress>" data displayed is correct or not
      Examples:
        | name | email | currentAddress | permanentAddress |
        | Himu | himu@example.com | #123 ABC Society Sector - 1, XYZ | #123 ABC Society Sector - 1, XYZ |