package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelcomePage wp=new WelcomePage(driver);
		wp.getSearchTF().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().refresh();
		wp.getSearchTF().sendKeys("mobile",Keys.ENTER);

//		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
//		searchTF.sendKeys("selenium",Keys.ENTER);
//		Thread.sleep(2000);
//		searchTF.sendKeys("mobiles",Keys.ENTER);
	}
}
