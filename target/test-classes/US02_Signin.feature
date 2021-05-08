@smoketest
Feature: SignIn negative

  Background: get SignIn Page

    Given user is on the Signin page


  Scenario: user can't sign in
       And user provides wrong username "Team5manager"
       And user provides correct password "managerTeam5"
       And user will click signInButton
       Then user get an error message

  Scenario: user can't sign in
    And user provides correct username "Team5Manager"
    And user provides wrong password "managerteam5"
    And user will click signInButton
    Then user get an error message

  Scenario: user can't sign in
    And user provides wrong username "Team5manager"
    And user provides wrong password "managerteam5"
    And user will click signInButton
    Then user get an error message