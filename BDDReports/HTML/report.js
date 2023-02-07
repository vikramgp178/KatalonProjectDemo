$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/01_LoginTest.feature");
formatter.feature({
  "name": "Login test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Login fnuctionality with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is on login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestCode.user_is_on_login_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTestCode.user_enters_the_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestCode.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestCode.user_navigated_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/LoginTestUsingScenarioOutline.feature");
formatter.feature({
  "name": "Login test using Scenario Outline",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Login fnuctionality with valid credentials using Scenario Outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user is on login screen",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters the valid \u003cusername\u003e and \u003cpassword\u003e test",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user navigated to homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Login fnuctionality with valid credentials using Scenario Outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user is on login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestCode.user_is_on_login_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the valid Admin and admin123 test",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTestCode.user_enters_the_valid_username_and_password_test(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestCode.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestCode.user_navigated_to_homepage()"
});
formatter.result({
  "status": "passed"
});
});