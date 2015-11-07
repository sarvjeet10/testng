package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExcelLIb {
		
	String filePath = "//Users//sarvjeet//Desktop//Test_Data.xlsx";
	
	public String getExcelData(String sheetName , int rowNum , int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException {
		  FileInputStream fis = new FileInputStream(filePath);
		  Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheetName);	
		  Row row = sh.getRow(rowNum);
		  String data = row.getCell(colNum).getStringCellValue();
		  return data;
	}
	
	//String password = eLib.getExcelData("Data" ,1 , 3);		
		
@Test
	public void sampleLoginTest1() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		ExcelLIb eLib  = new ExcelLIb();

		String userName = eLib.getExcelData("Data",1,2);		
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://accounts.google.com/");
			driver.findElement(By.id("Email")).sendKeys(userName);
			//driver.findElement(By.id("next")).click();
			//driver.quit();
		
		}
}
