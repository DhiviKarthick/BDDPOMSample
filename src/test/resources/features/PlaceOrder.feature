
Feature: Place Order
User will serach an item

Scenario: Search item
Given User is on home page
When User search an item "Parry Hotter"
Then Item must be displayed in search page

  Scenario: Add item to cart
  Given Item must be displayed
  When User add item to cart
  Then Item must be listed in cart
  
  