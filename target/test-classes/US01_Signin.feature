@smokedtest
Feature: SignIn Positive

  Background: get SignIn Page

    Given user is on the Signin page

    @login
    Scenario: user must be signIn with valid value
      And user provides username "Team5Manager"
      And user provides password "managerTeam5"
      And user clicks signInButton
      Then user must be signIn

