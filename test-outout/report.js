$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/raghu/eclipse-workspace/BDDFramework/src/main/java/Features/crmdeals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free crm create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "enduser is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "shermilag",
        "cutesharmi1"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user will close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "NewDealStepDefinition.enduser_is_on_login_page()"
});
formatter.result({
  "duration": 9788029793,
  "status": "passed"
});
formatter.match({
  "location": "NewDealStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 262408844,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 550082,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitions.LoginStepDefinition.user_clicks_on_login_button(LoginStepDefinition.java:44)\r\n\tat ✽.Then user clicks on login button(C:/Users/raghu/eclipse-workspace/BDDFramework/src/main/java/Features/crmdeals.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NewDealStepDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewDealStepDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewDealStepDefinition.user_will_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});