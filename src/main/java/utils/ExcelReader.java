package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelReader {

    static XSSFWorkbook wb ;
    static XSSFSheet ws;
    public static String getData(String FilePath, int column , int row ){
        try {
            wb = new XSSFWorkbook(new FileInputStream(FilePath));
            ws= wb.getSheetAt(0);

        }catch(Exception e){

        }

        return ws.getRow(row).getCell(column).getStringCellValue();
    }
}
