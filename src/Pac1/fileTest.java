package Pac1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fileTest {
  @Test
  public void f() throws InvalidFormatException, IOException, InterruptedException {
	  
		FileInputStream fis = new FileInputStream("//Users//sarvjeet//Desktop//Workbook1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		
		String name = row.getCell(0).getStringCellValue();
		System.out.println(name);
		
		Cell cel = row.createCell(1);
		cel.setCellType(Cell.CELL_TYPE_STRING);
		cel.setCellValue("pass");
		
		FileOutputStream fos = new FileOutputStream("//Users//sarvjeet//Desktop//Workbook1.xlsx");
		wb.write(fos);
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("name");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@name='btnK']")).click();
		
  }
}
