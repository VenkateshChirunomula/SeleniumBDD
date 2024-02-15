package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ObjectRepo;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AdminPage clickAdminLink(By ele){
        click(ele);
        return new AdminPage(driver);
    }

    public void userLogout(){
        click(ObjectRepo.HomePage.profileDropdown);
        wait(5);
        click(ObjectRepo.HomePage.logoutLink);
    }
}
