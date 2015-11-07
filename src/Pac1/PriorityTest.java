package Pac1;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority = 1,groups="st")
  public void launchbrowsertest() {
	  System.out.println("launch browser");
  }
  @Test(priority = 2,groups="rt")
  public void logintest() {
	  System.out.println("login");
  }
  @Test(priority = 3,groups="rt")
  public void createcustomertest() {
	  System.out.println("create customer");
  }
  @Test(priority = 4,groups="rt")
  public void logout() {
	  System.out.println("logout");
  }
}
