package utils;

import java.util.Date;
import java.util.Properties;

public class FilePaths {

    private static final String PROJECTPATH = System.getProperty("user.dir");
    private static final String ENVDATA = "\\src\\main\\resources\\env.properties";
    private static final String EXCELDATA = "\\src\\main\\resources\\testdata.xlsx";
    private static final String ExentPath = "\\src\\main\\resources\\extent-config.xml";

    private static final String reportsPath = "\\reports\\";

    public static String getEnvdata(){
       return PROJECTPATH+ENVDATA;
    }

    public static String getExentPath(){
        return PROJECTPATH+ExentPath;
    }

    public static String getEXCELDATA() {
        return PROJECTPATH+EXCELDATA;
    }
    public static String getReportsPath(){
        return PROJECTPATH+reportsPath+"index-"+new Date().getTime()+".html";
    }
}
