Feature: Evaluation HR
  Employee evaluation functionality

  Scenario: Access to employee information page
    Given I navigate to the login page
    And I enter the username "hreng" and password "umantis1"
    And I click login button
    And I click on an employee from TopApplicants
    Then I should see the Employee Information Page

  Scenario: Access to evaluation HR department
    Given I navigate to the login page
    And I enter the username "hreng" and password "umantis1"
    And I click login button
    And I click on an employee from TopApplicants
    And I click on Evaluation HR Department
    Then I should see the Evaluation HR Department Page

  Scenario: Complete evaluation form
    Given I navigate to the login page
    And I enter the username "hreng" and password "umantis1"
    And I click login button
    And I click on an employee from TopApplicants
    And I click on Evaluation HR Department
    And I complete form and click on Save
    And I navigate to Evaluation & Release tab
    Then I should see the comment was properly saved