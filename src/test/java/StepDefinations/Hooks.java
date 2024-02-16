package StepDefinations;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.*;
import pages.BasePage;
import utils.FilePaths;
import utils.Helper;
import utils.PropertyFileReader;
import static utils.Rerporter.*;

public class Hooks {

    public static ExtentTest test;
    ExtentReports er  = getExtentReports();
    ExtentSparkReporter esr = getSparkReporter();
    private Scenario scenario;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
        er.attachReporter(getSparkReporter());
        test= er.createTest(scenario.getName());
        BasePage.openUrl(PropertyFileReader.getValueFromFile(FilePaths.getEnvdata(),"URL"));
        BasePage.maximize();
    }
    @After
    public void after(){
       // Helper.getScreenShot();
        er.flush();
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
