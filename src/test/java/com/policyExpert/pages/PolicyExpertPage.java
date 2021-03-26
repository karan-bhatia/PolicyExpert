package com.policyExpert.pages;

import com.policyExpert.utils.DeclarationStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyExpertPage {

    WebDriver driver;
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
    @FindBy(xpath = "//div[@class='row question-row-address-of-property']//input[@type='text']")
    private WebElement postcode;
    @FindBy(xpath = "//button[@data-di-id='di-id-1bc45812-f66ffe1']")
    private WebElement manualAdressButton;
    @FindBy(xpath = "//div[@data-testid='line_1']/div[@class='col-xs-12'][2]/input")
    private WebElement adressLine1;
    @FindBy(xpath = "//div[@data-testid='line_2']/div[@class='col-xs-12'][2]/input")
    private WebElement adressLine2;
    @FindBy(xpath = "//div[@data-testid='town']/div[@class='col-xs-12'][2]/input")
    private WebElement town;
    @FindBy(xpath = "//div[@data-testid='postcode']/div[@class='col-xs-12'][2]/input")
    private WebElement postcodeManual;
    @FindBy(xpath = "//button[@data-testid='save-address']")
    private WebElement addressSaveButton;
    @FindBy(xpath = "//div[@class='row question-row-is-this-the-same-as']//button[1]")
    private WebElement correspondaceAddress_Yes;
    @FindBy(xpath = "//div[@class='row question-row-is-this-the-same-as']//button[2]")
    private WebElement correspondaceAddress_No;
    @FindBy(xpath = "//div[@class='row question-row-what-type-of-propert']//select")
    private WebElement typeOfProperty;
    @FindBy(xpath = "//div[@class='row question-row-which-of-these-best']//select")
    private WebElement propertyDescription;
    @FindBy(xpath = "//div[@class='row question-row-approximately-in-whi']//input")
    private WebElement yearOfBuilt;
    @FindBy(xpath = "//div[@class='row question-row-how-many-bedrooms-do']//select")
    private WebElement noOfBedrooms;
    @FindBy(xpath = "//div[@class='row question-row-do-you-own-the-prope']//select")
    private WebElement propertyOwnership;
    @FindBy(xpath = "//div[@class='row question-row-who-is-the-property']//select")
    private WebElement propertyOccupied;
    @FindBy(xpath = "//div[@class='row question-row-when-is-the-property']//select")
    private WebElement propertyOccupiedTime;
    @FindBy(xpath = "//div[@class='row question-row-are-there-trees-tall']//button[1]")
    private WebElement treesTaller_Yes;
    @FindBy(xpath = "//div[@class='row question-row-are-there-trees-tall']//button[2]")
    private WebElement treesTaller_No;
    @FindBy(xpath = "//div[@class='row question-row-does-your-property-h']//button[1]")
    private WebElement flatRoof_Yes;
    @FindBy(xpath = "//div[@class='row question-row-does-your-property-h']//button[2]")
    private WebElement flatRoof_No;
    @FindBy(xpath = "//body//div[@class='panel panel-default'][4]//button[1]")
    private WebElement addressStatement_agree;
    @FindBy(xpath = "//body//div[@class='panel panel-default'][4]//button[2]")
    private WebElement addressStatement_disagree;

    public PolicyExpertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String title, String first_Name, String last_Name) {
        try {
            titleDropDown.sendKeys(title);
            firstName.sendKeys(first_Name);
            lastName.sendKeys(last_Name);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    public void enterDOB(String date, String month, String year) {
        try {
            DOBDate.sendKeys(date);
            DOBMonth.sendKeys(month);
            DOBYear.sendKeys(year);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    public void enterOtherPersonalDetails(String marital_Status, String smoking_Status, String phone_No, String email_Id) {
        try {
            maritalStatus.sendKeys(marital_Status);
            if (smoking_Status.equalsIgnoreCase("Yes"))
                smoke_YES.click();
            else
                smoke_NO.click();
            telephoneNo.sendKeys(phone_No);
            emailId.sendKeys(email_Id);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    public void selectStatementStatus(String status) {
        try {
            if (status.equalsIgnoreCase("Agree"))
                statement_agree.click();
            else
                statement_disagree.click();
            DeclarationStatus.getInstance().setStatementStatus(status);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void selectBusinessPurposeStatus(String status) {
        try {
            if (DeclarationStatus.getInstance().getStatementStatus().equalsIgnoreCase("Disagree")) {
                if (status.equalsIgnoreCase("Agree"))
                    businessPurpose_agree.click();
                else
                    businessPurpose_disagree.click();
                DeclarationStatus.getInstance().setBusinessPurposeStatus(status);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void selectBusinessType(String businessType) {
        try {
            if (DeclarationStatus.getInstance().getStatementStatus().equalsIgnoreCase("Disagree") && DeclarationStatus.getInstance().getBusinessPurposeStatus().equalsIgnoreCase("Disagree")) {
                if (DeclarationStatus.getInstance().getBusinessPurposeStatus().equalsIgnoreCase("Disagree")) {
                    typeOfBusiness.sendKeys(businessType);
                    DeclarationStatus.getInstance().setBusinessType(businessType);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void selectNoOfEmployees(String employeeNo) {
        try {
            if (DeclarationStatus.getInstance().getStatementStatus().equalsIgnoreCase("Disagree") && DeclarationStatus.getInstance().getBusinessPurposeStatus().equalsIgnoreCase("Disagree")) {
                noOfEmployees.sendKeys(employeeNo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void selectDailyVisitors(String dailyVisitors) {
        try {
            if (DeclarationStatus.getInstance().getStatementStatus().equalsIgnoreCase("Disagree") && DeclarationStatus.getInstance().getBusinessPurposeStatus().equalsIgnoreCase("Disagree")) {
                if (!(DeclarationStatus.getInstance().getBusinessType().equalsIgnoreCase("Bed and breakfast") || DeclarationStatus.getInstance().getBusinessType().equalsIgnoreCase("Small hotel"))) {
                    noOfDailyVisitors.sendKeys(dailyVisitors);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void selectMaxPayingGuests(String payingGuests) {
        try {
            if (DeclarationStatus.getInstance().getStatementStatus().equalsIgnoreCase("Disagree") && DeclarationStatus.getInstance().getBusinessPurposeStatus().equalsIgnoreCase("Disagree")) {
                if ((DeclarationStatus.getInstance().getBusinessType().equalsIgnoreCase("Bed and breakfast") || DeclarationStatus.getInstance().getBusinessType().equalsIgnoreCase("Small hotel"))) {
                    noOfPayingGuests_noOfChildCare.sendKeys(payingGuests);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void selectChildCare(String childCare) {
        try {
            if (DeclarationStatus.getInstance().getStatementStatus().equalsIgnoreCase("Disagree") && DeclarationStatus.getInstance().getBusinessPurposeStatus().equalsIgnoreCase("Disagree")) {
                if (DeclarationStatus.getInstance().getBusinessType().equalsIgnoreCase("Registered child-minding") || DeclarationStatus.getInstance().getBusinessType().equalsIgnoreCase("Fostering")) {
                    noOfPayingGuests_noOfChildCare.sendKeys(childCare);

                }
            }
        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void enter_property_adress(String post_code) throws InterruptedException {
        try {
            postcode.sendKeys(post_code);
            manualAdressButton.click();
            manualAdressButton.click();
            Thread.sleep(2000);
            adressLine1.sendKeys("110");
            adressLine2.sendKeys("BishopGate");
            town.sendKeys("London");
            postcodeManual.sendKeys(post_code);
            addressSaveButton.click();

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void sameCorrespondanceAddress(String response) {
        try {
            if (response.equalsIgnoreCase("Yes"))
                correspondaceAddress_Yes.click();
            else
                correspondaceAddress_No.click();

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void select_property_type(String propertyType) {
        try {
            typeOfProperty.sendKeys(propertyType);

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void select_property_description(String property_description) {
        try {
            propertyDescription.sendKeys(property_description);

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void enter_year_of_property(String property_Year) {
        try {
            yearOfBuilt.sendKeys(property_Year);

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void no_of_bedroom(String bedroom_no) {
        try {
            noOfBedrooms.sendKeys(bedroom_no);

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void select_property_ownership(String property_ownership) {
        try {
            propertyOwnership.sendKeys(property_ownership);

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void select_propert_occupied_by(String property_occupied) {
        try {
            propertyOccupied.sendKeys(property_occupied);

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void select_property_occupied_time(String property_occupied_time) {
        try {
            propertyOccupiedTime.sendKeys(property_occupied_time);

        } catch (Exception e) {

            e.printStackTrace();
            throw e;
        }
    }

    public void length_of_trees(String response) {
        try {
            if (response.equalsIgnoreCase("Yes"))
                treesTaller_Yes.click();
            else
                treesTaller_No.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void select_flat_roof(String response) {
        try {
            if (response.equalsIgnoreCase("Yes"))
                flatRoof_Yes.click();
            else
                flatRoof_No.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void select_address_StatementStatus(String status) {
        try {
            if (status.equalsIgnoreCase("Agree"))
                addressStatement_agree.click();
            else
                addressStatement_disagree.click();
            DeclarationStatus.getInstance().setStatementStatus(status);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
