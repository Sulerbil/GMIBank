@smoketest
Feature:

  Scenario Outline:

    Given user is on the Signin page
    Given user provides username "<username>"
    Given user provides password "<password>"
    And user clicks signInButton
    Then user gets an error message

    Examples: username-password
    | username   | password   |
    |manager5Team|5ManagerTeam|
    |employee5   |Team5Manager|
    |userTeam5   |5TeamUser   |
    |sule1984    |erbil1984   |
    |senagyn     |sena2012    |