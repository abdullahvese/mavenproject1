@tag
  Feature: purchase order from web
    ı want to use this template for my feature file

  Background:
    Given I landed on ecommerce page

    @Regression
    Scenario Outline: Positive test of submitting the order

      Given logged in with username <name> and <password>
      When I added product <productname>
      And checkout <productname> and submit order
      Then "THANKYOU FOR THE ORDER." message is displayed on

      Examples:
      | name                     | password       |productname |
      | abdullah                 | 12345          | ZARA COAT 3|
