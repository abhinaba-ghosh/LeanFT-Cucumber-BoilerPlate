$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login_success.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "open Google Chrome and navigate to Gmail page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User logs in using username as \"abhinabaghosh.1994@gmail.com\" and password as \"Abhi@2002\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User presses Sign Out button",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definition.open_Google_Chrome_and_navigate_to_Gmail_page()"
});
formatter.result({
  "duration": 5656023265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abhinabaghosh.1994@gmail.com",
      "offset": 32
    },
    {
      "val": "Abhi@2002",
      "offset": 79
    }
  ],
  "location": "step_definition.user_logs_in_using_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 10302230860,
  "status": "passed"
});
formatter.match({
  "location": "step_definition.login_should_be_successful()"
});
formatter.result({
  "duration": 8098186566,
  "status": "passed"
});
formatter.match({
  "location": "step_definition.user_presses_Sign_Out_button()"
});
formatter.result({
  "duration": 8451654753,
  "status": "passed"
});
});