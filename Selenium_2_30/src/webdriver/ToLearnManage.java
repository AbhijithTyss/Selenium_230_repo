package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
		
		Thread.sleep(3000);
		driver.manage().window().minimize();
	}

}
