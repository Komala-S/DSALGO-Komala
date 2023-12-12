package pageobjects;
import java.io.IOException;

import org.openqa.selenium.By;

import Tests.Base;

public class StackPage extends Base{
	public static String path = "/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/src/test/java/Excel/excelfile.xlsx"; 

	By stackstart=By.xpath("(//a[contains(text(),'Get Started')])[4]");
	By stacklink1=By.xpath("//a[contains(text(),'Operations in Stack')]");
	By tryinstack1=By.xpath("//a[contains(text(),'Try here')]");
	By editorstack1=By.xpath("//textarea[@autocorrect='off']");
	By buttonstack1=By.xpath("//button[@type='button']");
	
	
	By stacklink2=By.xpath("//a[contains(text(),'Implementation')]");
	By tryinstack2=By.xpath("//a[contains(text(),'Try here')]");
	By editorstack2=By.xpath("//textarea[@autocorrect='off']");
	By buttonstack2=By.xpath("//button[@type='button']");
	
	
	
	By stacklink3=By.xpath("//a[contains(text(),'Applications')]");
	By tryinstack3=By.xpath("//a[contains(text(),'Try here')]");
	By editorstack3=By.xpath("//textarea[@autocorrect='off']");
	By buttonstack3=By.xpath("//button[@type='button']");
	public void stackstartfn()
	{
		driver.findElement(stackstart).click();
	}
	public void stacklink1fn()
	{
		driver.findElement(stacklink1).click();
	}
public void tryinstack1fn()
{
	driver.findElement(tryinstack1).click();
}
	
	public void editorstack1fn() throws IOException
	{
		String stackcode1=XLUtils.getCellData(path, "Sheet1", 1,0);
		driver.findElement(editorstack1).sendKeys(stackcode1);
	}
	public void buttonstack1fn()
	{
		driver.findElement(buttonstack1).click();
		driver.navigate().back();
		driver.navigate().back();

	}
	public void stacklink2fn()
	{
		driver.findElement(stacklink2).click();
	}
public void tryinstack2fn()
{
	driver.findElement(tryinstack2).click();
}
	
	public void editorstack2fn() throws IOException
	{
		String stackcode2=XLUtils.getCellData(path, "Sheet1", 1,0);

		driver.findElement(editorstack2).sendKeys(stackcode2);
	}
	public void buttonstack2fn()
	{
		driver.findElement(buttonstack2).click();
		driver.navigate().back();
		driver.navigate().back();

	}
	public void stacklink3fn()
	{
		driver.findElement(stacklink3).click();
	}
public void tryinstack3fn()
{
	driver.findElement(tryinstack3).click();
}
	
	public void editorstack3fn() throws IOException
	{
		String stackcode3=XLUtils.getCellData(path, "Sheet1", 1,0);
		driver.findElement(editorstack3).sendKeys(stackcode3);

	}
	public void buttonstack3fn()
	{
		driver.findElement(buttonstack3).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		//driver.navigate().back();
		//driver.navigate().back();


		
	}


}
