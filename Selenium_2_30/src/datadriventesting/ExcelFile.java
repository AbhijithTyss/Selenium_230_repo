package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step 1: create FIS object
		FileInputStream fis=new FileInputStream("./testdata/TestScriptData.xlsx");
		
		// step 2: create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		// step 3: call read methods
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	}

}
