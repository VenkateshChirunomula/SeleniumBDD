package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import utils.FilePaths;
import utils.ObjectRepo;
import utils.PropertyFileReader;

public class TC_002 extends BaseTest {


    @Test
    public void validateAdmin() {
        lp.enterUsername(ObjectRepo.LoginPage.userNameField, PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(), "Username"))
                .enterPassword(ObjectRepo.LoginPage.passwordField, PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(), "Password"))
                .clickLogin(ObjectRepo.LoginPage.buttonLogin)
                .clickAdminLink(ObjectRepo.HomePage.linkAdmin)
                .clickAdd(ObjectRepo.AdminPage.buttonAdd);
        Assert.assertEquals("Sai", "sai");
    }
}
