@all
Feature: Test


  @TC1
  Scenario Outline: Elements -> TextBox automation
    Then Setup Environment and open chrome
    And Search for DemoQA website in chrome tab
    Then Click on Elements button
    And Click on Text button present below Element dropdown
    Then Fill the details "<name>","<email>","<currentAddress>","<permanentAddress>"
    And Click on Submit button
    And Verify if "<name>","<email>","<currentAddress>","<permanentAddress>" data displayed is correct or not
    Then Close browser
    Examples:
      | name | email            | currentAddress                   | permanentAddress                 |
      | Himu | himu@example.com | #123 ABC Society Sector - 1, XYZ | #123 ABC Society Sector - 1, XYZ |

  @TC2
  Scenario Outline: Elements -> Radio buttons automation
    Then Setup Environment and open chrome
    And Search for DemoQA website in chrome tab
    Then Click on Elements button
    And Click on Radio button present below Element dropdown
    Then Verify if three radio buttons get displayed on screen
    And Click on first radio button
    And Verify if "<Yes>" text displayed on screen
    Then Click on second radio button
    And Verify if "<Impressive>" text displayed on screen
    Then Check if user is able to click on third radio button
    Then Close browser
    Examples:
      | Yes | Impressive |
      | Yes | Impressive |

  @TC3
  Scenario Outline: Verify if table data gets sort or not for the #1 column
    Then Setup Environment and open chrome
    And Search for DemoQA website in chrome tab
    Then Click on Elements button
    And Click on "<input>" button
    Then Click on "<columnNumber>" column header
    And Verify if list get sort or not
    Then Close browser
    Examples:
      | input      | columnNumber |
      | Web Tables | 0            |
