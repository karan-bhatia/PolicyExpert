package com.policyExpert.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class SeleniumUtility {

    public static void takeScreenShot() {
        // fileName of the screenshot
        Date d = new Date();
        String screenshotFileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
        // store screenshot in that file

        File scrFile = ((TakesScreenshot) BrowserSetting.getInstance().getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile,
                    new File(System.getProperty("user.dir") + "/target/Screenshots/" + screenshotFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] scrBytes = ((TakesScreenshot) BrowserSetting.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
        DeclarationStatus.getInstance().getScenario().embed(scrBytes, "image/png");
    }

}
