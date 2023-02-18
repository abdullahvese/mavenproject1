@smoke @Login

    Feature: enter correct name and correct password

      Background:
        Given ı landed on page

        Scenario: enter correct name and password and see url
          Given enter log in page
          And enter "vesek@vesek" as a email
        And enter "1234" as a password
          And enter login button
          Then user should be loged in
          Then user must see his or her name


