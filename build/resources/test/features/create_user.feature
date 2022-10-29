Feature: Create an user on regres.in
  T want to create an user

  Scenario: Creation an user
    When you create an user
      | name    | job  |
      | brandon | java |
    Then I should see the user created
