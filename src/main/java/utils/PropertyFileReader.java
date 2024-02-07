package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {

    static Properties p;

    public static String getValueFromFile(String File,String Key){

        p = new Properties();
        try {
            p.load(new FileInputStream(File));
        }catch(Exception e){
            System.err.println("File not Found" +e.getMessage());
        }
        return p.getProperty(Key);
    }
}
