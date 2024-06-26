package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/products_page/7");
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId);
		
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("flipkart")) {
				driver.close();
			}	
		}
	}
}
