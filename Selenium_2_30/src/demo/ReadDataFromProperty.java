package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		// step 1: create FIS object
		FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		
		// step 2: create respective file type object
		Properties prop=new Properties();
		
		prop.load(fis);
		// step 3: call read method
		String URL = prop.getProperty("url");
		System.out.println(URL);
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
	}

}
