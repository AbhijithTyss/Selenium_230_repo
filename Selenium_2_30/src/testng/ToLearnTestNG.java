package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {// TestNG class
	
	@Test(priority = -2,invocationCount = 4,threadPoolSize = 4)
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login testcase executed",true);
	}
	
	@Test(priority = -1,enabled = false)
	public void register() {// test case
		// test steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register testcase executed",true);
	}
}
