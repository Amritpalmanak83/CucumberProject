$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyApplicatio.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login Platform smoke test",
  "description": "",
  "id": "login-platform-smoke-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 23,
  "name": "Test login with Valid credientials",
  "description": "",
  "id": "login-platform-smoke-test;test-login-with-valid-credientials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Open the ChromeBrowser and start Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I enter \"Host\" and \"dnnhost\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Check User able to loginName to Platform or not \"SuperUser Account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSmokeTest.open_the_ChromeBrowser_and_start_Platform()"
});
formatter.result({
  "duration": 5817796614,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Host",
      "offset": 9
    },
    {
      "val": "dnnhost",
      "offset": 20
    }
  ],
  "location": "LoginSmokeTest.i_enter_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 186566673,
  "status": "passed"
});
formatter.match({
  "location": "LoginSmokeTest.click_Login_button()"
});
formatter.result({
  "duration": 693067677,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SuperUser Account",
      "offset": 49
    }
  ],
  "location": "LoginSmokeTest.check_User_able_to_loginName_to_Platform_or_not(String)"
});
formatter.result({
  "duration": 684814051,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Test login with InValid credientials",
  "description": "",
  "id": "login-platform-smoke-test;test-login-with-invalid-credientials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "Open the ChromeBrowser and start Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I enter \"InvalidUser\" and \"InValidPass\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Check User able to loginName to Platform or not \"InvalidUser\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSmokeTest.open_the_ChromeBrowser_and_start_Platform()"
});
formatter.result({
  "duration": 4993786790,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidUser",
      "offset": 9
    },
    {
      "val": "InValidPass",
      "offset": 27
    }
  ],
  "location": "LoginSmokeTest.i_enter_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 344608581,
  "status": "passed"
});
formatter.match({
  "location": "LoginSmokeTest.click_Login_button()"
});
formatter.result({
  "duration": 312587190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidUser",
      "offset": 49
    }
  ],
  "location": "LoginSmokeTest.check_User_able_to_loginName_to_Platform_or_not(String)"
});
formatter.result({
  "duration": 674700240,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Test Error message and take a Screenshot",
  "description": "",
  "id": "login-platform-smoke-test;test-error-message-and-take-a-screenshot",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "Open the ChromeBrowser and start Platform",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I enter \"host\" and \"dnnhost\"",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Check error message and capture screenshot \"tag3\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSmokeTest.open_the_ChromeBrowser_and_start_Platform()"
});
formatter.result({
  "duration": 4381252315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "host",
      "offset": 9
    },
    {
      "val": "dnnhost",
      "offset": 20
    }
  ],
  "location": "LoginSmokeTest.i_enter_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 166118587,
  "status": "passed"
});
formatter.match({
  "location": "LoginSmokeTest.click_Login_button()"
});
formatter.result({
  "duration": 649816198,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tag3",
      "offset": 44
    }
  ],
  "location": "LoginSmokeTest.check_error_message_and_capture_screenshot(String)"
});
formatter.result({
  "duration": 543789294,
  "status": "passed"
});
});