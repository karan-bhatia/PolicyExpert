package com.policyExpert.pages;

import com.policyExpert.utils.DeclarationStatus;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyExpertPage {

    @FindBy(xpath = "//select[@data-di-id='di-id-dff2f8bb-909d6497']")
    private WebElement titleDropDown;

    @FindBy(xpath = "//div[@class='row question-row-first-name']//input[@type='text']")
    private WebElement firstName;

    @FindBy(xpath = "//div[@class='row question-row-last-name']//input[@type='text']")
    private WebElement lastName;

    @FindBy(xpath = "//select[@data-di-id='di-id-7e740179-8f6139c4']")
    private WebElement DOBDate;

    @FindBy(xpath = "//select[@data-di-id='di-id-e91fb56f-8a602d48']")
    private WebElement DOBMonth;

    @FindBy(xpath = "//select[@data-di-id='di-id-9fffce1b-c4639e9b']")
    private WebElement DOBYear;

    @FindBy(xpath = "//select[@data-di-id='di-id-ed68979d-45569ab0']")
    private WebElement maritalStatus;

    @FindBy(xpath = "//div[@class='row question-row-what-is-your-occupat']//input[@type='text']")
    private WebElement occupation;

    @FindBy(xpath = "//div[@class='row question-row-does-anybody-living']//div[@class='questionset-input']//button[1]")
    private WebElement smoke_YES;

    @FindBy(xpath = "//div[@class='row question-row-does-anybody-living']//div[@class='questionset-input']//button[2]")
    private WebElement smoke_NO;

    @FindBy(xpath = "//div[@class='row question-row-main-telephone-numbe']//input[@type='text']")
    private WebElement telephoneNo;

    @FindBy(xpath = "//div[@class='row question-row-what-is-your-e-mail']//input[@type='text']")
    private WebElement emailId;

    @FindBy(xpath = "//body//div[@class='panel panel-default'][2]//button[1]")
    private WebElement statement_agree;

    @FindBy(xpath = "//body//div[@class='panel panel-default'][2]//button[2]")
    private WebElement statement_disagree;

    @FindBy(xpath = "//div[@class='row question-row-your-property-is-not']//button[1]")
    private WebElement businessPurpose_agree;

    @FindBy(xpath = "//div[@class='row question-row-your-property-is-not']//button[2]")
    private WebElement businessPurpose_disagree;

    @FindBy(xpath = "//div[@class='row question-row-what-type-of-busines']//select")
    private WebElement typeOfBusiness;

    @FindBy(xpath = "//div[@class='row question-row-number-of-employees']//select")
    private WebElement noOfEmployees;

    @FindBy(xpath = "//div[@class='row question-row-number-of-daily-visi']//select")
    private WebElement noOfDailyVisitors;

    @FindBy(xpath = "//div[@class='row question-row-what-is-the-maximum']//select")
    private WebElement noOfPayingGuests_noOfChildCare;

    @FindBy(xpath = "//div[@data-testid='section'][2]//div[@data-testid='question'][5]//button[1]")
    private WebElement noneOccupantsBankrupt_agree;

    @FindBy(xpath = "//div[@data-testid='section'][2]//div[@data-testid='question'][5]//button[2]")
    private WebElement noneOccupantsBankrupt_disagree;

    @FindBy(xpath = "//div[@class='row question-row-is-the-bankruptcy-ty']//select")
    private WebElement typePfBankruptcy;

    @FindBy(xpath = "//div[@class='row question-row-has-this-been-discha']//button[1]")
    private WebElement discharged_agree;

    @FindBy(xpath = "//div[@class='row question-row-has-this-been-discha']//button[2]")
    private WebElement discharged_disagree;

    @FindBy(xpath = "//div[@class='row question-row-please-provide-date']//input[@type='text']")
    private WebElement dateOfDischarge;

    @FindBy(xpath = "//div[@data-testid='section'][2]//div[@data-testid='question'][8]//button[1]")
    private WebElement countyCourtJudgement_agree;

    @FindBy(xpath = "//div[@data-testid='section'][2]//div[@data-testid='question'][8]//button[2]")
    private WebElement countyCourtJudgement_disagree;

    @FindBy(xpath = "//div[@class='row question-row-how-many-cc-js-have']//select")
    private WebElement noOfCCJS;

    @FindBy(xpath = "//div[@class='row question-row-what-was-the-value-o']//select")
    private WebElement valueOfCCJS;

    @FindBy(xpath = "//div[@class='row question-row-none-of-the-occupant']//button[1]")
    private WebElement noneHomeInsuranceDeclined_agree;

    @FindBy(xpath = "//div[@class='row question-row-none-of-the-occupant']//button[2]")
    private WebElement noneHomeInsuranceDeclined_disagree;

    WebDriver driver;
    ExtentTest extentTest;

    public PolicyExpertPage(WebDriver driver) {
        this.driver = driver;
        //this.extentTest = ExtentManager.getInstance().getExtentTest();
        PageFactory.initElements(driver, this);
    }

    public void enterName(String title, String first_Name, String last_Name){
        try{
            titleDropDown.sendKeys(title);
            firstName.sendKeys(first_Name);
            lastName.sendKeys(last_Name);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void enterDOB(String date, String month, String year){
        try{
            DOBDate.sendKeys(date);
            DOBMonth.sendKeys(month);
            DOBYear.sendKeys(year);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void enterOtherPersonalDetails(String marital_Status, String smoking_Status, String phone_No, String email_Id){
        try{
            maritalStatus.sendKeys(marital_Status);
            if(smoking_Status.equalsIgnoreCase("Yes"))
                smoke_YES.click();
            else
                smoke_NO.click();
            telephoneNo.sendKeys(phone_No);
            emailId.sendKeys(email_Id);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void selectStatementStatus(String status){
        try{
            if(status.equalsIgnoreCase("Agree"))
                statement_agree.click();
            else
                statement_disagree.click();
            DeclarationStatus.getInstance().setStatementStatus(status);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
