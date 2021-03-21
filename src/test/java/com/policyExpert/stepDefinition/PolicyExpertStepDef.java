package com.policyExpert.stepDefinition;

import com.policyExpert.pages.PolicyExpertPage;
import com.policyExpert.utils.BrowserSetting;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PolicyExpertStepDef {

    @Given("^user opens \"([^\"]*)\" browser and access Policy Expert URL \"([^\"]*)\"$")
    public void userOpensBrowserAndAccessPolicyExpertURL(String browser, String url) throws Throwable {
        try {
            BrowserSetting.getInstance().initializeTestBaseSetup(browser);
            BrowserSetting.getInstance().launchURL(url);
        } catch (Throwable e) {
            throw e;
        }
    }

    @And("^user enters the \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",$")
    public void userEntersThe(String arg0, String arg1, String arg2) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).enterName(arg0, arg1, arg2);
    }

    @And("^user enters Date of Birth as \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersDateOfBirthAsAnd(String arg0, String arg1, String arg2) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).enterDOB(arg0, arg1, arg2);
    }

    @And("^user enters the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void userEntersThe(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).enterOtherPersonalDetails(arg0, arg1, arg2, arg3);
    }

    @When("^user selects the status in Statements about you as \"([^\"]*)\"$")
    public void userSelectsTheStatusInStatementsAboutYouAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).selectStatementStatus(arg0);
    }

    @And("^user selects the status for business purpose property as \"([^\"]*)\"$")
    public void userSelectsTheStatusForBusinessPurposePropertyAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).selectBusinessPurposeStatus(arg0);
    }

    @And("^user selects the type of business from dropdown as \"([^\"]*)\"$")
    public void userSelectsTheTypeOfBusinessFromDropdownAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).selectBusinessType(arg0);
    }

    @And("^user selects the number of employees as \"([^\"]*)\"$")
    public void userSelectsTheNumberOfEmployeesAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).selectNoOfEmployees(arg0);
    }

    @And("^user selects the number of daily visitors as \"([^\"]*)\"$")
    public void userSelectsTheNumberOfDailyVisitorsAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).selectDailyVisitors(arg0);
    }

    @And("^user selects max number of paying guests as \"([^\"]*)\"$")
    public void userSelectsMaxNumberOfPayingGuestsAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).selectMaxPayingGuests(arg0);
    }

    @And("^user selects max number of children care for \"([^\"]*)\"$")
    public void userSelectsMaxNumberOfChildrenCareFor(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).selectChildCare(arg0);
    }
}
