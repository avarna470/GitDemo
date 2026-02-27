Feature: verify checkout page and place the order 

@PlaceOrder
Scenario Outline: Placing the order of products

Given User is on Greenkart Landing Page
When User searched with shortname like <Items> and actual product item is displayed
And User adds 3 items of the selected product <Items> to the cart
Then User proceeds to checkout page and verifies the product <Items> details
And and User Verifies the Apply and place order buttons

Examples:

| Items |
| tom |