package pageobjects;
import java.io.IOException;

import org.openqa.selenium.By;
import org.apache.commons.lang3.RandomStringUtils;

import Tests.Base;
public class RegisterPage extends Base {
	public static String path = "/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/src/test/java/Excel/excelfile.xlsx"; 
	public static String generateUsername;
	public static String generatePass;
	By getstarted=By.xpath("//button[@class='btn']");
	By register=By.linkText("Register");
	By username=By.xpath("//input[@name='username']");
	By pass1=By.cssSelector("input#id_password1");
	By pass2=By.cssSelector("input#id_password2");
	By submit=By.xpath("//input[@type='submit']");
	  
	
	 public void getstartedfn()
	{
		 driver.findElement(getstarted).click();
	}
	public void registerfn()
	{
		driver.findElement(register).click();
	}
	
public void usernamefn() throws IOException
{
	generateUsername=RandomStringUtils.randomAlphabetic(6);

//System.out.println(generateUsername);
	driver.findElement(username).sendKeys(generateUsername);

	XLUtils.setCellData(path, "Sheet1", 3, 0,generateUsername);

	
}
public void passfn() throws IOException
{	
	generatePass=RandomStringUtils.randomAlphanumeric(6);
	String pass=generatePass+"_@#";
	//System.out.println(pass);

	driver.findElement(pass1).sendKeys(pass);
	XLUtils.setCellData(path, "Sheet1", 3, 1,pass);

	}

public void pass1fn() throws IOException
{
	//System.out.println(generatePass);
	String pass=generatePass+"_@#";

	 driver.findElement(pass2).sendKeys(pass);
	 XLUtils.setCellData(path, "Sheet1", 3, 2,pass);

}

public void submitfn()
{
	driver.findElement(submit).click();
}

}
