package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageobjects.XLUtils;
import Tests.Base;
public class LoginPage extends Base {
	public static String path = "/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/src/test/java/Excel/excelfile.xlsx"; 

    By getstarted=By.xpath("//button[@class='btn']");
    By signin=By.linkText("Sign in");
	By user=By.cssSelector("input#id_username");
	By passwd=By.cssSelector("input#id_password");
	By login=By.xpath("//input[@value='Login']");
	
	By text=By.xpath("//div[contains(text(),'Invalid Username and Password')]");


	public void getstartedfn()
	{
		driver.findElement(getstarted).click();
	}
		
	public void signinfn()
	{
		driver.findElement(signin).click();
	}
	public void userfn() throws IOException
	{
		String uname =XLUtils.getCellData(path, "Sheet1", 0, 0);
		driver.findElement(user).sendKeys(uname);

	}
	public void invaliduserfn() throws IOException
	{
		String uname1 =XLUtils.getCellData(path, "Sheet1", 0, 2);
		driver.findElement(user).sendKeys(uname1);


	}
	
	public void passwdfn() throws IOException
	{
		String pwd =XLUtils.getCellData(path, "Sheet1", 0, 1);

		driver.findElement(passwd).sendKeys(pwd);
	}
	public void invalidpwd() throws IOException
	{
		String pwd1 =XLUtils.getCellData(path, "Sheet1", 0, 3);
		driver.findElement(passwd).sendKeys(pwd1);

	}
		public void loginfn()
	{
		driver.findElement(login).click();
	}
	
	public void invalidloginfn()
	{
		    String actualmessage=driver.findElement(text).getText();
			String expectedmessage="You are logged in";
			Assert.assertEquals(actualmessage, expectedmessage);
			
		
		System.out.println("assertion failed");
		
	}

}
