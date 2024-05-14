package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Dimension size = driver.findElement(By.id("small-searchterms")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}

}
