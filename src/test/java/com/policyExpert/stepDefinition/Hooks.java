package com.policyExpert.stepDefinition;

import com.policyExpert.utils.BrowserSetting;
import com.policyExpert.utils.DeclarationStatus;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void init(Scenario scenario) {
        DeclarationStatus.getInstance().newDeclarationStatus();
        DeclarationStatus.getInstance().setScenario(scenario);
    }

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = BrowserSetting.getInstance().getDriver();
        try {
            if (scenario.isFailed()) {
                scenario.embed(((TakesScreenshot) BrowserSetting.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
            }
            driver.close();
            driver.quit();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
