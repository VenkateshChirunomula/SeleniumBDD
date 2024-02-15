package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import utils.FilePaths;
import utils.ObjectRepo;
import utils.PropertyFileReader;

public class TC_002 extends TC_001 {


    @Test (dependsOnMethods = {"loginTest"})
    public void validateAdmin() {

                homePage.clickAdminLink(ObjectRepo.HomePage.linkAdmin)
                .clickAdd(ObjectRepo.AdminPage.buttonAdd);
        Assert.assertEquals("Sai", "sai");
    }
}
