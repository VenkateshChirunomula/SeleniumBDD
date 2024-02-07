package pages;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ObjectRepo;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public  LoginPage enterUsername(By ele,String username){
       sendKeys(ele,username);
       return new LoginPage(driver);
    }
    public LoginPage enterPassword (By ele,String password){
        sendKeys(ele,password);
        return new LoginPage(driver);
    }
    public  HomePage clickLogin(By ele){
        click(ele);
        return new HomePage(driver);
    }
}
