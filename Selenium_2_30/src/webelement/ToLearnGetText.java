package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTF = driver.findElement(By.id("username"));
		usernameTF.clear();
		usernameTF.sendKeys("selenium");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String errorMsg = driver.findElement(By.id("validationMessage")).getText();
		System.out.println(errorMsg);
		if (errorMsg.equals("Invalid")) {
			System.out.println("error message is displayed");
		}else {
			System.out.println("error message is not displayed");
		}
	}

}
