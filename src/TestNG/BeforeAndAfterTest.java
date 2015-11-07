package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterTest {
  @Test
  public void createcustomertest() {
	  System.out.println("create and verify customer");
  }
  @BeforeMethod
  public void configbeforemethod() {
	  System.out.println("login to App");
  }
  @AfterMethod
  public void configaftermethod() {
	  System.out.println("logout");
  }
@Test(dependsOnMethods = {"createcustomertest"})
	  public void modifycustomertest() {
		  System.out.println("modify customer");
}
@BeforeClass
		  public void configbeforeclass() {
			  System.out.println("open browser,open db,object intialization");
		  }
@AfterClass
public void configAfterclass() {
	  System.out.println("close browser,close db");
}
}

  

