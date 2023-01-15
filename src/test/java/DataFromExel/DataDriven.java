package DataFromExel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDriven {
    public static void main(String[] args) throws IOException {

    }
    public ArrayList<String> getData(String testcaseName) throws IOException {

        ArrayList<String>list=new ArrayList<>();


        FileInputStream fis = new FileInputStream("C://Exel//data.xlsx");
     XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {

            if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstrow = rows.next();
                Iterator<Cell> ce=firstrow.cellIterator();
                  int k=0;
                  int column=0;
                  while (ce.hasNext()){
                    Cell value=ce.next();
                  if ( value.getStringCellValue().equalsIgnoreCase("Testcase")){
                   column=k;


                  }

                  k++;
                }


              while (rows.hasNext()){
                  Row r=rows.next();
                  if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)){

                      Iterator<Cell> cv=r.cellIterator();
                      while (cv.hasNext()){
                     Cell c=cv.next();
                     if (c.getCellType()== CellType.STRING) {
                         list.add(cv.next().getStringCellValue());
                     }
                     else {
                        list.add( NumberToTextConverter.toText(c.getNumericCellValue()));

                     }
                     }
                  }

              }


             }


        }

    return list;
    }
}