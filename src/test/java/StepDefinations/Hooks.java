package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import pages.BasePage;
import utils.FilePaths;
import utils.Helper;
import utils.PropertyFileReader;

public class Hooks {

    @Before
    public void before(){
        BasePage.openUrl(PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(),"URL"));
        BasePage.maximize();
    }
    @After
    public void after(){
       // Helper.getScreenShot();
        BasePage.closeBrowser();
    }
    @AfterStep
    public void afterStep(){
        BasePage.waitForPageLoad();
        Helper.getScreenShot();
        System.out.println("after step");
    }
    @BeforeStep
    public void beforeStep(){
        System.out.println("before step");
    }
}
