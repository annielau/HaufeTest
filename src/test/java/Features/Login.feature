Feature: LoginFeature
  Login functionality of the application

  Scenario: Login with valid username and password
    Given I navigate to the login page
    And I enter the username "Test.barcelona" and password "TestBCN1"
    And I click login button
    Then I should see the WelcomePage


