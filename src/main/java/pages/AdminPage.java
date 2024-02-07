package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends BasePage{
    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public UserManagementPage clickAdd(By ele){
        click(ele);
        return new UserManagementPage(driver);
    }
}
