package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// step 1: create FIS object
		FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		
		// step 2: create respective file type object
		Properties prop=new Properties();
		
		// step 3: call read methods
		prop.load(fis);
		String URL = prop.getProperty("url");
		
		System.out.println(URL);
		WebDriver driver=new ChromeDriver();	
		driver.get(URL);
	}

}
