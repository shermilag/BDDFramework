Feature: Free CRM new Contacts page

Scenario Outline: User is able to create new contact

Given user is on login page
When tittle of the login page is free CRM
Then user will enter "<username>" and "<password>"
Then user will click on login button
Then user moves to new contact page
And user will enter "<firstname>" and "<lastname>" and "<company>"
Then user clicks on save button
#Then verify users are created
Then close browser

Examples: 
| username | password | firstname | lastname | company |
| shermilag| cutesharmi1 |Adam  | Guli       | Google |
| shermilag| cutesharmi1 | Tom       | Peter | Amezon  |
| shermilag| cutesharmi1 |Peter |  Thomos | Google |