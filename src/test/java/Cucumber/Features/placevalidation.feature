
@API
Feature: Validating place APIs

  Scenario Outline: Verify if place has been succesfully aadded using Addplaceapı
    Given Add place Payload name "<name>" language "<language>" adress "<adress>"
    When user calls "AddPlaceApı" with Post Http
    Then the API call is success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"

   Examples:
      | name     | language | adress  |
      | abh      | turkh    | keri    |
      |www       |swwwwwwww |qwüğğğğ  |


