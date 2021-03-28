# PolicyExpert

This project contains Policy Expert Web Portal tests using BDD Cucumber Selenium. It uses Page Factory framework to identify web elements on the portal. At the end of each tests the results are published. 

## Prerequisites
1. Java 8
2. Apache Maven
3. Cucumber plugin
4. Lombok plugin
5. IDE (Intellij or Eclipse)

## Running the Tests Locally
### Running using IntelliJ IDE
You can trigger any one scenario or feature by right-clicking the scenario name and selecting the run option.

###Running the tests using Maven
```
mvn clean test
```
To run any particular Test.
```
mvn clean test -DcucumberTags="Tags"
```
####Tags
@ValidateTheDataPassedForSuccessFlow
@ValidateDataIsProvidedForDifferentSetOfQuestions

###Reports

To check the execution report, navigate to `/taget/cucumber-html-report/index.html` and open the file in browser. For each pass test the report will appear in green mentioning the feature steps & data and for failed tests it will appear in red along with screenshot attached for the failed step.