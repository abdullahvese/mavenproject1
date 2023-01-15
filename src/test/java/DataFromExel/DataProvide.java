package DataFromExel;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProvide {


    @Test(dataProvider = "drivetest")
    public void testCaseData(String sas,String sss,String loy){
        System.out.println(sas+sss+loy);

    }




DataFormatter formatter=new DataFormatter();
    @DataProvider(name = "drivetest")
    public Object[][] getData() throws IOException {




        FileInputStream fis=new FileInputStream("C://Exel//data.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
       XSSFSheet sheet= workbook.getSheetAt(0);
       int rowCount=sheet.getPhysicalNumberOfRows();
        XSSFRow row= sheet.getRow(0);
        int col=row.getLastCellNum();
        Object[][]data=new Object[rowCount-1][col];
        for (int i = 0; i <rowCount ; i++) {

            row=sheet.getRow(i+1);
            for (int j = 0; j <col ; j++) {

                XSSFCell cell=row.getCell(j);

                data[i][j]= formatter.formatCellValue(cell);
            }
        }






return data;


    }




























}
