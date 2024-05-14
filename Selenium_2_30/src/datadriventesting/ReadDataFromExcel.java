package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step 1: create FIS object
		FileInputStream fis=new FileInputStream("./testdata/TestScriptData.xlsx");
		
		// step 2: create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		// step 3: call read methods
		String URL = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String email = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		Sheet sheet1 = workbook.getSheet("Sheet1");
		double number = sheet1.getRow(1).getCell(3).getNumericCellValue();
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(URL);
		System.out.println(email);
		System.out.println(number);
		System.out.println(status);
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(date);
		
//		WebDriver driver=new ChromeDriver();
//		driver.get(URL);
//		driver.findElement(By.id("Email")).sendKeys(email);
	}

}
