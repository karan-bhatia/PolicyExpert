package com.policyExpert.utils;

import cucumber.api.java.After;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BrowserSetting {

    private static BrowserSetting instance;
    @Getter
    @Setter
    private WebDriver driver;

    public BrowserSetting() {
    }

    public static BrowserSetting getInstance() {
        if (instance == null) {
            instance = new BrowserSetting();
        }
        return instance;
    }

    public void initDriver(String browserType) {
        switch (browserType) {
            case "Chrome":
                driver = initChromeDriver();
                break;
            default:
                System.out.println("browser : " + browserType + " is invalid, Launching Chrome as browser of choice..");
                driver = initChromeDriver();
        }
    }

    private WebDriver initChromeDriver() {
        System.out.println("\n\nLaunching google chrome");
        if (OperatingSystem.isMac()) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "/drivers/mac/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\drivers\\windows\\chromedriver.exe");
        }
        ChromeOptions options = new ChromeOptions();
        options.setCapability("capability_name", "capability_value");
        options.setCapability("type", "test-type");
        options.setCapability("windowSize", "start-maximized");
        options.setCapability("automation", "--enable-automation");
        options.setCapability("browserType", "test-type=browser");
        options.setCapability("infobars", "disable-infobars");
        options.setExperimentalOption("useAutomationExtension", false);
        return new ChromeDriver(options);
    }

    public void launchURL(String url) {
        driver.get(url);
    }

    public void initializeTestBaseSetup(String browser) {
        initDriver(browser);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, SECONDS);

    }

    @After
    public void afterScenario() {
        WebDriver driver = BrowserSetting.getInstance().getDriver();
        try {
            driver.quit();
        } catch (Exception e) {
            e.getMessage();
        }
    }


}
