@AccountManagement
Feature: Account management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an Account
    Then My Account page should be displayed

    Examples:
      | Firstname | Lastname | Email          | Password | ConfirmPassword |
      | John      | James    | john@yahoo.com | Jaspa123 | Jaspa123        |


  