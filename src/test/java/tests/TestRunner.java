package tests;

import com.cucumber.listener.Reporter;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.FilePaths;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Login",plugin = {"pretty","html:reports/index.html"},features = "src/test/resources",glue = {"StepDefinations"})
public class TestRunner {

}
