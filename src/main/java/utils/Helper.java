package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

import java.io.File;
import java.util.Date;

public class Helper {

    public static void getScreenShot(){
    try {
     TakesScreenshot screenshot = (TakesScreenshot) BasePage.getDriver();
     File scr = screenshot.getScreenshotAs(OutputType.FILE);
     BasePage.waitForPageLoad();

     FileUtils.copyFile(scr, new File(".//reports//image" + new Date().getTime() + ".png"));
        }catch (Exception e){
     System.err.println(e.getMessage());
        }
    }

    public static String getBase64String(){
        TakesScreenshot screenshot = (TakesScreenshot) BasePage.getDriver();
        String scr = screenshot.getScreenshotAs(OutputType.BASE64);
        return scr;
    }
}
