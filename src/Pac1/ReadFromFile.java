package Pac1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadFromFile {
  @Test
  public void f() throws InvalidFormatException, IOException, InterruptedException {
	  String ExpectedTCName = "tc10";
	  FileInputStream fis = new FileInputStream("//Users//sarvjeet//Desktop//Workbook1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum()+1;
		System.out.println(rowcount);

		for(int i =1;i<rowcount;i++){
			Row row = sh.getRow(i);
			String actualTCName = row.getCell(0).getStringCellValue();
			System.out.println(actualTCName);
			if(ExpectedTCName.equals(actualTCName)){
				String usrname =row.getCell(1).getStringCellValue();
				String pwd =row.getCell(2).getStringCellValue();
				System.out.println(usrname);
				System.out.println(pwd);

				WebDriver driver = new FirefoxDriver();
				driver.get("http://gmail.com");
	
				Thread.sleep(2000); 
				driver.findElement(By.id("Email")).sendKeys(usrname);
				driver.findElement(By.id("Passwd")).sendKeys(pwd);
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
				driver.findElement(By.id("signIn")).click();

			}
		}
		
  }
}
