package Pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testNGPgm1 {
  @Test
  public void ftest() {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/?gws_rd=ssl");
		//driver.quit();

  }
}
