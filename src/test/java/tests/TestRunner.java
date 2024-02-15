package tests;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Login",plugin = {"pretty","html:reports/index.html"},features = "src/test/resources",glue = {"StepDefinations"})
public class TestRunner {

}
