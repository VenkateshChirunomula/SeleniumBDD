package StepDefinations;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.LoginPage;
import utils.FilePaths;
import utils.ObjectRepo;
import utils.PropertyFileReader;

public class LoginSteps{


    static LoginPage lp ;
    @Given("user launch the application")
    public void launch_app(){

    }
    @Then("user enters username")
    public void user_enters_username() {
        lp = new LoginPage(BasePage.getDriver());

        lp.enterUsername(ObjectRepo.LoginPage.userNameField,"Admin");
    }
    @Then("user enters password")
    public void user_enters_password() {
        lp.enterPassword(ObjectRepo.LoginPage.passwordField,"admin123");
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
