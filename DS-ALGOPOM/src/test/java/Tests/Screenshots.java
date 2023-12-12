package Tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshots extends Base{
	public void captureScreenshots(String Filename) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
    	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(SrcFile, new File("/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/Screenshot/register.png"));

	}
	public void captureScreenshot1(String Filename1) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
    	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(SrcFile, new File("/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/Screenshot/invalidlogin.png"));

	}


}
