package Tests;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class ITestListenerclass extends Screenshots implements ITestListener {

		
		
	public void onTestFailure(ITestResult result) {
		try {
			captureScreenshot1(result.getMethod().getMethodName()+"invalidlogin.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	@Attachment
	public byte[]screenshotInReport(WebDriver driver)
	{
		return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	@Attachment(value="{0}",type="text/plain")
	public static String saveText(String message)
	{
		return message;
		
	}
}
