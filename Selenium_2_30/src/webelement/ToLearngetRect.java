package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetRect {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Rectangle rect = driver.findElement(By.xpath("//input[@value='Search']")).getRect();
		System.out.println("height: "+rect.getHeight());
		System.out.println("Width: "+rect.getWidth());
		System.out.println("x: "+rect.getX());
		System.out.println("y: "+rect.getY());
	}

}
