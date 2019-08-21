$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFeatures/Testme.feature");
formatter.feature({
  "name": "TestMe Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "My demo report validation in jenkins",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "TEstme is up and running",
  "keyword": "Given "
});
formatter.match({
  "location": "Basiclogin.testme_is_up_and_running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Registered user enter the valid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "Basiclogin.registered_user_enter_the_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verfiy for the login ststus for his cred",
  "keyword": "And "
});
formatter.match({
  "location": "Basiclogin.verfiy_for_the_login_ststus_for_his_cred()"
});
formatter.result({
  "status": "passed"
});
});