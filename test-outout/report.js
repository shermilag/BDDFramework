$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/raghu/eclipse-workspace/BDDFramework/src/main/java/Features/dealsmap.feature");
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
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "shermilag",
        "cutesharmi1"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 12
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 13
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 14
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user will close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepWithMapDefinition.enduser_is_on_login_page()"
});
formatter.result({
  "duration": 7797803621,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 326007840,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 790214,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitions.LoginStepDefinition.user_clicks_on_login_button(LoginStepDefinition.java:44)\r\n\tat ✽.Then user clicks on login button(C:/Users/raghu/eclipse-workspace/BDDFramework/src/main/java/Features/dealsmap.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_will_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});