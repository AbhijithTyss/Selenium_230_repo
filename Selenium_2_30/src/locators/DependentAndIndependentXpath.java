package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentAndIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']/../..//button[@id='addToCart']")).click();
	}
}