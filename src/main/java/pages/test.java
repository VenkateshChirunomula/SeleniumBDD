package pages;


import org.testng.Assert;
import utils.FilePaths;
import utils.ObjectRepo;
import utils.PropertyFileReader;


import java.util.Objects;


public class test {
    public static void main(String[] args) {

       BasePage.openUrl(PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(),"URL"));
       BasePage.maximize();
       LoginPage lp = new LoginPage(BasePage.getDriver());
       BasePage.waitForElement(ObjectRepo.LoginPage.userNameField);
       lp.enterUsername(ObjectRepo.LoginPage.userNameField,PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(),"Username"))
               .enterPassword(ObjectRepo.LoginPage.passwordField,PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(),"Password"))
               .clickLogin(ObjectRepo.LoginPage.buttonLogin)
               .clickAdminLink(ObjectRepo.HomePage.linkAdmin)
               .clickAdd(ObjectRepo.AdminPage.buttonAdd)
               .addUser();
       BasePage.closeBrowser();
    }
}
