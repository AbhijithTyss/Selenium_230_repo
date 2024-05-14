package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EntireWebPageScreenshot {

	public static void main(String[] args) throws IOException {
		
		LocalDateTime systemTime = LocalDateTime.now();
		String actTime = systemTime.toString().replace(":", "-");
		
		System.out.println(systemTime);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File dest=new File("./screenshots/image-"+actTime+".png");
		FileHandler.copy(temp, dest);
	}

}
