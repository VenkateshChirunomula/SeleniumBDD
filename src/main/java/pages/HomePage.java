package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AdminPage clickAdminLink(By ele){
        click(ele);
        return new AdminPage(driver);
    }
}