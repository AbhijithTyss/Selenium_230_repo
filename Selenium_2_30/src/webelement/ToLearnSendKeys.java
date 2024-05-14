package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeys {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement serachTF = driver.findElement(By.name("keyword"));
		serachTF.sendKeys("selenium");
		Thread.sleep(3000);
		serachTF.sendKeys(Keys.ENTER);
	}

}
