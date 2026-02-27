Feature: Search order of Products

@SearchPage
Scenario Outline: Searching for same product in both Home Page and Offers Page

Given User is on Greenkart Landing Page
When User searched with shortname like <Items> and actual product item is displayed 
Then User searches the same <Items> shortname in offers page to check if the product exist

Examples:
| Items |
| tom |
| BeeT |

