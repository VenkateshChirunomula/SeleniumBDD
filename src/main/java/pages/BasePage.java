package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public static void openUrl(String url){
        getDriver().get(url);
    }

    public static WebDriver getDriver(){
        if(driver==null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void sendKeys(By ele, String text){

        waitForElement(ele);
        getDriver().findElement(ele).sendKeys(text);
    }
    public static void click(By ele){

        waitForElement(ele);
        getDriver().findElement(ele).click();
    }

    public static void waitForElement(By ele){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(ele));
    }

    public static void getPageName(){
       System.out.println(getDriver().getTitle());
    }

    public static String getText(By ele){
        waitForElement(ele);
       return getDriver().findElement(ele).getText();
    }

    public static void closeBrowser(){
        getDriver().quit();
    }

    public static void maximize(){
        getDriver().manage().window().maximize();
    }
}
