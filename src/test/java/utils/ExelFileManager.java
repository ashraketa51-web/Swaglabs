package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExelFileManager {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
 public ExelFileManager(String filepath, String sheetname){
     try {
         FileInputStream fileInputStream = new FileInputStream(new File(filepath));
         workbook = new XSSFWorkbook(fileInputStream);
         sheet=workbook.getSheet(sheetname);


     }catch (Exception e){
         e.getStackTrace();
     }
 }
 public String getSpecicCellValue(int rowNum, int colNum){
     Cell cell=sheet.getRow(rowNum).getCell(colNum);
     DataFormatter dataFormatter=new DataFormatter();
     return dataFormatter.formatCellValue(cell);
 }

}
