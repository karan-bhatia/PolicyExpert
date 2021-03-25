package com.policyExpert.stepDefinition;

import com.policyExpert.pages.PolicyExpertPage;
import com.policyExpert.utils.BrowserSetting;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

    @And("^user enters the postcode of the address as \"([^\"]*)\"$")
    public void userEntersThePostcodeOfTheAddress(String postCode) throws InterruptedException {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).enter_property_adress(postCode);
    }

    @And("^user selects the same correspondence address as \"([^\"]*)\"$")
    public void userSelectsTheSameCorrespondenceAddressAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).sameCorrespondanceAddress(arg0);
    }

    @And("^user selects property type as \"([^\"]*)\"$")
    public void userSelectsPropertyTypeAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).select_property_type(arg0);
    }

    @And("^user selects property description as \"([^\"]*)\"$")
    public void userSelectsPropertyDescriptionAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).select_property_description(arg0);
    }

    @And("^user add the the year of property built as \"([^\"]*)\"$")
    public void userAddTheTheYearOfPropertyBuiltAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).enter_year_of_property(arg0);
    }

    @And("^user enters the number of bedrooms in the property as \"([^\"]*)\"$")
    public void userEntersTheNumberOfBedroomsInThePropertyAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).no_of_bedroom(arg0);
    }

    @And("^user selects the ownership of property as \"([^\"]*)\"$")
    public void userSelectsTheOwnershipOfPropertyAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).select_property_ownership(arg0);
    }

    @And("^user enters the property occupied by as \"([^\"]*)\"$")
    public void userEntersThePropertyOccupiedByAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).select_propert_occupied_by(arg0);
    }

    @And("^user enters the property occupied time as \"([^\"]*)\"$")
    public void userEntersThePropertyOccupiedTimeAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).select_property_occupied_time(arg0);
    }

    @And("^user selects the tress taller than (\\d+) meters as \"([^\"]*)\"$")
    public void userSelectsTheTressTallerThanMetersAs(int arg0, String arg1) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).length_of_trees(arg1);
    }

    @And("^user selects the flat roof for property as \"([^\"]*)\"$")
    public void userSelectsTheFlatRoofForPropertyAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).select_flat_roof(arg0);
    }

    @Then("^user selects statements about property as \"([^\"]*)\"$")
    public void userSelectsStatementsAboutPropertyAs(String arg0) throws Throwable {
        new PolicyExpertPage(BrowserSetting.getInstance().getDriver()).select_address_StatementStatus(arg0);
    }
}
