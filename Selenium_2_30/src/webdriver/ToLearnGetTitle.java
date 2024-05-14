package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Demo Web")) {
			System.out.println("User navigated successfully");
		}else {
			System.out.println("user failed to navigate");
		}
	}

}
