package StepDefinations;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.model.ScreenCapture;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.LoginPage;
import utils.FilePaths;
import utils.Helper;
import utils.ObjectRepo;
import utils.PropertyFileReader;

public class LoginSteps{



    static LoginPage lp ;

    @Given("user launch the application")
    public void launch_app(){

    }
    @Then("user enters username")
    public void user_enters_username() {
        try {
            Hooks.test.log(Status.INFO, "user enters username");
            lp = new LoginPage(BasePage.getDriver());
            lp.enterUsername(ObjectRepo.LoginPage.userNameField, "Admin");

        }catch (Exception e){
            Hooks.test.log(Status.FAIL,e.getMessage(), MediaEntityBuilder.createScreenCaptureFromBase64String(Helper.getBase64String()).build());

        }
    }
    @Then("user enters password")
    public void user_enters_password() {
        try {
            Hooks.test.log(Status.INFO, "user enters password");
            lp.enterPassword(ObjectRepo.LoginPage.passwordField, "admin123");
        }
        catch (Exception e){
            Hooks.test.log(Status.FAIL,e.getMessage(), MediaEntityBuilder.createScreenCaptureFromBase64String(Helper.getBase64String()).build());

        }
    }
    @When("user clicks on signin button")
    public void user_clicks_on_signin_button() {
        lp.clickLogin(ObjectRepo.LoginPage.buttonLogin);
    }
    @Then("i validate user login")
    public void i_validate_user_login() {
        Assert.assertEquals("","");
    }
}
