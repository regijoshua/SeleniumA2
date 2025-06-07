$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:\\Java Eclipse\\Cucumber\\src\\test\\java\\Feature\\Login.feature");
formatter.feature({
  "name": "DemoWebshop Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login Function",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should navigate to demowebshop application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click on login link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter the username as muhilbharathi1997@gmail.com",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter the password as MuhilM",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "login should happen",
  "keyword": "And "
});
formatter.match({
  "location": "setups.loginShouldHappen()"
});
formatter.result({
  "status": "skipped"
});
});