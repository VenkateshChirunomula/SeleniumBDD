package tests;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import pages.AdminPage;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import utils.FilePaths;
import utils.PropertyFileReader;

public class BaseTest {

    static LoginPage lp ;
    static HomePage homePage;
    static AdminPage adminPage;
    static SoftAssert Assert;

    @BeforeSuite
    public void init(){
        BasePage.openUrl(PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(),"URL"));
        lp = new LoginPage(BasePage.getDriver());
        homePage = new HomePage(BasePage.getDriver());
        adminPage = new AdminPage(BasePage.getDriver());
        Assert = new SoftAssert();
    }
    @AfterSuite
    public void tearDown(){
        BasePage.closeBrowser();
        Assert.assertAll();
    }

}
