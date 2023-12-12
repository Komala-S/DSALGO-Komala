package pageobjects;
import java.io.IOException;

import org.openqa.selenium.By;

import Tests.Base;
public class QueuePage extends Base {
	public static String path = "/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/src/test/java/Excel/excelfile.xlsx"; 

	By queuestartlink=By.xpath("(//a[contains(text(),'Get Started')])[5]");
	By queuelink1=By.xpath("//a[contains(text(),'Implementation of Queue in Python')]");
	By queuetry1=By.xpath("//a[contains(text(),'Try here')]");
	By editorqueue1=By.xpath("//textarea[@autocorrect='off']");
	By buttonqueue1=By.xpath("//button[@type='button']");
	
	
	By queuelink2=By.xpath("//a[contains(text(),'Implementation using collections.deque')]");
	By queuetry2=By.xpath("//a[contains(text(),'Try here')]");
	By editorqueue2=By.xpath("//textarea[@autocorrect='off']");
	By buttonqueue2=By.xpath("//button[@type='button']");
	
	
	
	By queuelink3=By.xpath("//a[contains(text(),'Implementation using array')]");
	By queuetry3=By.xpath("//a[contains(text(),'Try here')]");
	By editorqueue3=By.xpath("//textarea[@autocorrect='off']");
	By buttonqueue3=By.xpath("//button[@type='button']");
	
	
	
	By queuelink4=By.xpath("//a[contains(text(),'Queue Operations')]");
	By queuetry4=By.xpath("//a[contains(text(),'Try here')]");
	By editorqueue4=By.xpath("//textarea[@autocorrect='off']");
	By buttonqueue4=By.xpath("//button[@type='button']");
	
public void queuestartfn()
{
	driver.findElement(queuestartlink).click();
}
public void queuelink1fn()
{
	driver.findElement(queuelink1).click();
}
public void queuetry1fn()
{
	driver.findElement(queuetry1).click();
}
public void editorqueue1fn() throws IOException
{
	String queuecode1=XLUtils.getCellData(path, "Sheet1", 1,0);
	driver.findElement(editorqueue1).sendKeys(queuecode1);
}
public void buttonqueue1fn()
{
	driver.findElement(buttonqueue1).click();
	driver.navigate().back();
}
public void queuelink2fn()
{
	driver.findElement(queuelink2).click();
}
public void queuetry2fn()
{
	driver.findElement(queuetry2).click();
}
public void editorqueue2fn() throws IOException
{
	String queuecode2=XLUtils.getCellData(path, "Sheet1", 1,0);
	driver.findElement(editorqueue2).sendKeys(queuecode2);
}
public void buttonqueue2fn()
{
	driver.findElement(buttonqueue2).click();
	driver.navigate().back();
}
public void queuelink3fn()
{
	driver.findElement(queuelink3).click();
}
public void queuetry3fn()
{
	driver.findElement(queuetry3).click();
}
public void editorqueue3fn() throws IOException
{
	String queuecode3=XLUtils.getCellData(path, "Sheet1", 1,0);
	driver.findElement(editorqueue3).sendKeys(queuecode3);
}
public void buttonqueue3fn()
{
	driver.findElement(buttonqueue3).click();
	driver.navigate().back();
}
public void queuelink4fn()
{
	driver.findElement(queuelink4).click();
}
public void queuetry4fn()
{
	driver.findElement(queuetry4).click();
}
public void editorqueue4fn() throws IOException
{
	String queuecode4=XLUtils.getCellData(path, "Sheet1", 1,0);
	driver.findElement(editorqueue4).sendKeys(queuecode4);
}
public void buttonqueue4fn()
{
	driver.findElement(buttonqueue4).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();

	

}


}
