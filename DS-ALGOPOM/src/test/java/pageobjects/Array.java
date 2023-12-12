package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import Tests.Base;


public class Array extends Base {
	public static String path = "/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/src/test/java/Excel/excelfile.xlsx"; 

	By getstarted=By.xpath("(//a[contains(text(),'Get Started')])[2]");
	By link1=By.xpath("//a[contains(text(),'Arrays in Python')]");
	By tryinarray=By.xpath("//a[contains(text(),'Try here')]");
	By editor=By.xpath("//textarea[@autocorrect='off']");
	By button=By.xpath("//button[@type='button']");
	
	By link2=By.xpath("//a[contains(text(),'Arrays Using List')]");
	By tryinarray1=By.xpath("//a[contains(text(),'Try here')]");
	By editor1=By.xpath("//textarea[@autocorrect='off']");
	By button1=By.xpath("//button[@type='button']");
	
	
	By link3=By.xpath("//a[contains(text(),'Basic Operations in Lists')]");
	By tryinarray2=By.xpath("//a[contains(text(),'Try here')]");
	By editor2=By.xpath("//textarea[@autocorrect='off']");
	By button2=By.xpath("//button[@type='button']");
	
	By link4=By.xpath("//a[contains(text(),'Applications of Array')]");
	By tryinarray3=By.xpath("//a[contains(text(),'Try here')]");
	By editor3=By.xpath("//textarea[@autocorrect='off']");
	By button3=By.xpath("//button[@type='button']");

	 public void getstrtfn()
	 {
		driver.findElement(getstarted).click(); 
	 }
	 public void getlinkfn()
	 {
		 driver.findElement(link1).click();
	 }
	 public void tryarrayfn()
	 {
		driver.findElement(tryinarray).click();
	 }
	 public void editorfn() throws IOException
	 {
			String code =XLUtils.getCellData(path, "Sheet1", 1,0);

		 driver.findElement(editor).sendKeys(code);
	 }
     public void buttonfn()
    {
	driver.findElement(button).click();
	driver.navigate().back();
	driver.navigate().back();

    }
     public void link2fn()
     {
    	 driver.findElement(link2).click();
     }
     public void tryarray1fn()
     {
    	driver.findElement(tryinarray1).click(); 
     }
     public void editor1fn() throws IOException
     {
 		String code1 =XLUtils.getCellData(path, "Sheet1", 1, 0);

    	driver.findElement(editor1).sendKeys(code1); 
     }
public void button1()
{
	driver.findElement(button1).click();
	driver.navigate().back();

}
public void link3fn()
{
	driver.findElement(link3).click();
}
public void tryinarray2fn()
{
	driver.findElement(tryinarray2).click();
}
public void editor2fn() throws IOException
{
	String code2 =XLUtils.getCellData(path, "Sheet1", 1, 0);

	driver.findElement(editor2).sendKeys(code2);
}
public void button2fn()
{
	driver.findElement(button2).click();
	driver.navigate().back();

}
public void link4fn()
{
	driver.findElement(link4).click();
}
public void tryinarray3fn()
{
	driver.findElement(tryinarray3).click();
}
public void editor3fn() throws IOException
{
	String code3 =XLUtils.getCellData(path, "Sheet1", 1, 0);

	driver.findElement(editor3).sendKeys(code3);
}
public void button3fn()
{
	driver.findElement(button3).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();



}
}
