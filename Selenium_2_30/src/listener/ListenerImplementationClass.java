package listener;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementationClass extends BaseClass implements ITestListener,ISuiteListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String TIME = LocalDateTime.now().toString().replace(":", "-");
		String methodName = result.getName();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenshots/"+methodName+TIME+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log(methodName+ " is failed",true);
	}

}
