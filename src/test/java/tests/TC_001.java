package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utils.FilePaths;
import utils.ObjectRepo;
import utils.PropertyFileReader;

public class TC_001  extends BaseTest{

    @Test
    public void loginTest(){

        lp.enterUsername(ObjectRepo.LoginPage.userNameField,PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(),"Username"))
                .enterPassword(ObjectRepo.LoginPage.passwordField,PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(),"Password"))
                .clickLogin(ObjectRepo.LoginPage.buttonLogin);
        Assert.assertEquals(BasePage.getText(ObjectRepo.HomePage.dashBoardText),"Dashbard" , "dashboard is not present");
        Assert.assertEquals('c','c');
        Assert.assertEquals("Venkatsh","KRP");

        //HardAssert ->  terminates when an assertion fails
        //SoftAssert ->  asserts all the validation

    }

    @Test
    public void logoutTest(){

    }


//    @AfterSuite
//    public void quit(){
//
//    }
}
