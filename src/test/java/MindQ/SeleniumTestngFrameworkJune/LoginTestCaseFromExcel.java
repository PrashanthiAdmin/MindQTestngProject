package MindQ.SeleniumTestngFrameworkJune;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import MindQ.SeleniumTestngFrameworkJune.Utils.ExcelUtils;
import MindQ.SeleniumTestngFrameworkJune.pageobjects.SigninPage;

public class LoginTestCaseFromExcel extends SigninPage{

	
	
	public static void loginUsingInvalidCredentials() throws IOException {
		
		
		String file = "C:\\Users\\PRASHANTHI\\eclipse-workspace\\SeleniumTestngFrameworkJune\\TestDataFiles\\TestData.xlsx";
		
		String email = ExcelUtils.getCellValueFromExcelSheet(file, 0, 1, 0);
		
		System.out.println("Email is "+email);
		
		String pwd = ExcelUtils.getCellValueFromExcelSheet(file, 0, 1, 1);
		System.out.println("Password is "+pwd);

		
		SoftAssert sa = new SoftAssert();
		enterEmailId(email);
		enterPassword(pwd);
		clickSigninButton();

		boolean actualResult = errorMessagePresence();
		boolean expectedResult = true;
		
		
		
		
		sa.assertEquals(actualResult,expectedResult,"Test case is failed");
		String result = "";

		if(actualResult == expectedResult) {
			
			 result = "Passed";
			 
			ExcelUtils.setCellData(file, 0, 1, 2, result); 
			
		}else {
			
			result = "Failed";
			
			ExcelUtils.setCellData(file, 0, 1, 2, result); 

		}
		
		

		
		sa.assertAll();
		
	}
	
	
	@Test
     public static void loginUsingInvalidCredentialsAndWriteResult() throws IOException {
		
		
		String file = "C:\\Users\\PRASHANTHI\\eclipse-workspace\\SeleniumTestngFrameworkJune\\TestDataFiles\\TestData.xlsx";
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0); //1st sheet
		
		int rows = sheet.getLastRowNum();
		
		System.out.println("No.Of Rows are "+rows);
		SoftAssert sa = new SoftAssert();

		for(int i = 1; i<=rows; i++) {
			
		
			
	   //  int cellCount = sheet.getRow(i).getLastCellNum(); capturing no.of cells
	     
	     //for(int j = 0; j<=cellCount; j++)	
		
		String email = ExcelUtils.getCellValueFromExcelSheet(file, 0, i, 0);
		
		System.out.println("Email is "+email);
		
		String pwd = ExcelUtils.getCellValueFromExcelSheet(file, 0, i, 1);
		System.out.println("Password is "+pwd);

		
		enterEmailId(email);
		enterPassword(pwd);
		clickSigninButton();

		boolean actualResult = errorMessagePresence();
		boolean expectedResult = true;
		
		
		
		
		
		String result = "";
		if(actualResult == expectedResult) {
			
			 result = "Passed";
			 
			ExcelUtils.setCellData(file, 0, i, 2, result); 
			
		}else {
			
			result = "Failed";
			
			ExcelUtils.setCellData(file, 0, i, 2, result); 

		}
		

		sa.assertEquals(actualResult,expectedResult,"Test case is failed");

		
	}
		
		sa.assertAll();

		
	}
	
	
	
	public static void loginUsingInvalidCredentialsMultiple() throws IOException {
		
		
		FileInputStream fs = new FileInputStream("C:\\Users\\PRASHANTHI\\eclipse-workspace\\SeleniumTestngFrameworkJune\\TestDataFiles\\TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		
		
		XSSFSheet sheet = workbook.getSheetAt(0); //1st sheet
		
		int rows = sheet.getLastRowNum();
		
		System.out.println("No.Of Rows are "+rows);
		
		for(int i = 1; i<=rows; i++) {
			
		
		XSSFRow row = sheet.getRow(i); //1st row
		
		XSSFCell cell = row.getCell(0); //1st Email id 
		
		XSSFCell cell1 = row.getCell(1); //1st Password
		
		String email = cell.getStringCellValue();
		
		System.out.println("Email is "+email);
		
		String pwd = cell1.getStringCellValue();
		System.out.println("Password is "+pwd);

		
		SoftAssert sa = new SoftAssert();
		enterEmailId(email);
		enterPassword(pwd);
		clickSigninButton();

		boolean actualResult = errorMessagePresence();
		boolean expectedResult = true;
		
		
		
		
		sa.assertEquals(actualResult,expectedResult,"Test case is failed");
		
		

		
		sa.assertAll();
		
	}
		
	}
	
	
}
