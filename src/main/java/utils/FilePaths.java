package utils;

import java.util.Properties;

public class FilePaths {

    private static final String PROJECTPATH = System.getProperty("user.dir");
    private static final String ENVDATA = "\\src\\main\\resources\\env.properties";
    private static final String EXCELDATA = "\\src\\main\\resources\\testdata.xlsx";

    public static String getEnvdata(){
       return PROJECTPATH+ENVDATA;
    }

    public static String getEXCELDATA() {
        return PROJECTPATH+EXCELDATA;
    }
}
