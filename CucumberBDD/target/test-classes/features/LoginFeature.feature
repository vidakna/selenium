
@Regression 
Feature: Title of your feature
  I want to use this template for my feature file

  @Loging_And_Order
  Scenario: Loging to Store and place an order in happy path
    Given I need to navigate Loging page
    When I enter <Username>
    And I enter <Password>
    And I click the sign in button
    And I Scroll to banner
    And I Scroll to blog
    And I click on product
    And I add product to cart
    And I click on checkout
    
   

  