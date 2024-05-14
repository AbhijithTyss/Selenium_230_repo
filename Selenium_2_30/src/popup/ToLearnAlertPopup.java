package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
//		driver.switchTo().alert();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		Alert alertPopup = driver.switchTo().alert();
		System.out.println(alertPopup.getText());
//		alertPopup.accept();
		alertPopup.dismiss();
		driver.findElement(By.linkText("Register")).click();
	}

}
