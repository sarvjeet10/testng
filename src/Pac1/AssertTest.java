package Pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	
  @Test
  public void Assertvery() {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://mail.google.com/mail/");

		String expectedplaceholder = "Enter your email";
		
		WebDriverWait wait = new WebDriverWait(driver, 60);  // 1 minute 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
		
	    String actualplaceholder = driver.findElement(By.id("Email")).getAttribute("placeholder");
		
		//if assert fails then the text message is displayed. execution of the code will stop if assert fails,control will not go to next line.
		Assert.assertEquals(actualplaceholder, expectedplaceholder, actualplaceholder+ " text is not verified in UI");
		
		System.out.println(actualplaceholder+ " page is verified");		
  }
}
