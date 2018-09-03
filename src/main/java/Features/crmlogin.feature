#Feature: Free CRM login Feature
#
#Scenario: Free CRM Login Scenario
#
#Given user is already on login page
#When tittle of login page is free CRM
#Then user enters "shermilag" and "cutesharmi1"
#Then user clicks on login button
#And user is on home page
#
#
Feature: Free CRM login Feature data driven testing

Scenario Outline: Free CRM Login Scenario

Given user is already on login page
When tittle of login page is free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
And user is on home page
Then close the browser

Examples:

| username | password    |
| shermilag| cutesharmi1 |
| tom      | test123     |
