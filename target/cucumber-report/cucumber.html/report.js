$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/gov/harrow/resources/featurefiles/Harrow.feature");
formatter.feature({
  "line": 1,
  "name": "Harrow Group Study Test Sample",
  "description": "As a user I want to navigate to login page",
  "id": "harrow-group-study-test-sample",
  "keyword": "Feature"
});
formatter.before({
  "duration": 23786138800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "harrow-group-study-test-sample;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on login or register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to login page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 441326700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginOrRegisterLink()"
});
formatter.result({
  "duration": 23084196200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToLoginPageSuccessfully()"
});
formatter.result({
  "duration": 298630400,
  "status": "passed"
});
formatter.after({
  "duration": 942852700,
  "status": "passed"
});
formatter.before({
  "duration": 14672101500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should not able to log in with invalid credentials",
  "description": "",
  "id": "harrow-group-study-test-sample;user-should-not-able-to-log-in-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on login or register link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter email \"abc@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password \"xyz123\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see error massage \"Invalid Username/Password supplied\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 52400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginOrRegisterLink()"
});
formatter.result({
  "duration": 23067850400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 15
    }
  ],
  "location": "MyStepdefs.iEnterEmail(String)"
});
formatter.result({
  "duration": 950131200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz123",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 495161900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 1562964200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid Username/Password supplied",
      "offset": 28
    }
  ],
  "location": "MyStepdefs.iShouldSeeErrorMassage(String)"
});
formatter.result({
  "duration": 190660900,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Your sign in attempts have exceeded the limit]\u003e but was:\u003c[Invalid Username/Password supplied]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat uk.gov.harrow.cucumber.stepdefs.MyStepdefs.iShouldSeeErrorMassage(MyStepdefs.java:50)\r\n\tat ✽.Then I should see error massage \"Invalid Username/Password supplied\"(src/test/java/uk/gov/harrow/resources/featurefiles/Harrow.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1840707700,
  "status": "passed"
});
});