package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ferrari {
	@Test(groups = "smoke")
	public void launchFerrari() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("ferrari launched successfully",true);
	}
}
