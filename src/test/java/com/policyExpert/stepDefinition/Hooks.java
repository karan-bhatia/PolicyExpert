package com.policyExpert.stepDefinition;

import com.policyExpert.utils.BrowserSetting;
import com.policyExpert.utils.DeclarationStatus;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void init(Scenario scenario) {
        System.out.println("Before Test");
        DeclarationStatus.getInstance().newDeclarationStatus();
        DeclarationStatus.getInstance().setScenario(scenario);
    }

    @After
    public void tearDown() {
        System.out.println("After Test");
        WebDriver driver = BrowserSetting.getInstance().getDriver();
        try {
            driver.quit();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
