@delete

  Feature: enter correct account and delete this account

    Background:
      Given ı landed on page

      Scenario Outline:
        Given click on sigup/login button
        When enter "<email>" as a email for scenario
        And enter "<password>" as a password for scenario
        And click login button
        Then click on delete button

        Examples:
        | email      |  password|
        | vesek@vesek|   1234   |