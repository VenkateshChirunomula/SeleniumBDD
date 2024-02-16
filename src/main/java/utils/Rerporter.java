package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Rerporter {

    public static ExtentReports extentReports;

    public static ExtentReports getExtentReports(){
        if(extentReports==null) {
            extentReports =  new ExtentReports();
        }
            return extentReports;
    }

    public static ExtentSparkReporter esr ;

    public static ExtentSparkReporter getSparkReporter(){
        if(esr==null) {
            esr =  new ExtentSparkReporter(FilePaths.getReportsPath());
        }
        return esr;
    }

    public static void main(String[] args) {
        getExtentReports().attachReporter(getSparkReporter());
        ExtentTest test =  extentReports.createTest("Cucumber Test");

        test.log(Status.PASS,"Test is pass");
        test.log(Status.FAIL,"Test is fail");

        extentReports.flush();
    }
}
