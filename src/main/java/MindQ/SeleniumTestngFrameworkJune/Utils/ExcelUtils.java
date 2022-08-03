package MindQ.SeleniumTestngFrameworkJune.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	
	public static String getCellValueFromExcelSheet(String filepath, int sheetIndex, int rowIndex, int cellNum) throws IOException {
		
		
		
     FileInputStream fs = new FileInputStream(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(sheetIndex); //1st sheet
		
		XSSFRow row = sheet.getRow(rowIndex); //1st row
		
		XSSFCell cell = row.getCell(cellNum); //1st Email id 
		
		
		
		String value = cell.getStringCellValue();
		
		
		return value;
	}
	
	
	
	public static void setCellData(String filepath, int sheetIndex, int rowIndex, int cellNum, String cellValue) throws IOException {
		 FileInputStream fs = new FileInputStream(filepath);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			
			XSSFSheet sheet = workbook.getSheetAt(sheetIndex); //1st sheet
			
			XSSFRow row = sheet.getRow(rowIndex); //1st row
			
			XSSFCell cell = row.createCell(cellNum);
			
			cell.setCellValue(cellValue);
			
			fs.close();
			
			FileOutputStream fout = new FileOutputStream(filepath);
			
			workbook.write(fout);
			
			fout.close();
			
			
	}
}
