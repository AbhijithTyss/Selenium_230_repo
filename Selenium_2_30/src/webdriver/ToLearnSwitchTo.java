package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/5");
		Thread.sleep(30000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId);
		
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			driver.close();		
		}
	}
}
