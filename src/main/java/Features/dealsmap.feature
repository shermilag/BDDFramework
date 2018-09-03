Feature: Deal data creation

Scenario: Free crm create a new deal scenario

Given enduser is on login page
Then user enters username and password
| username  | password    |
| shermilag | cutesharmi1 |
Then user clicks on login button
Then user moves to new deal page
Then user enters deal details 
		| title      | amount | probability | commission |
        | test deal1 | 1000   | 50          | 10         |
        | test deal2 | 2000   | 60          | 20         |
        | test deal3 | 3000   | 70          | 30         |
Then user will close the browser
