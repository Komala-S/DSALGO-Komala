package pageobjects;
import java.io.IOException;

import org.openqa.selenium.By;

import Tests.Base;


public class DatastructurePage extends Base {
	public static String path = "/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/src/test/java/Excel/excelfile.xlsx"; 

	By start=By.xpath("(//a[contains(text(),'Get Started')])[1]");
	By time=By.xpath("//a[contains(text(),'Time Complexity')]");
	By trylink=By.xpath("//a[contains(text(),'Try here')]");
	By txtarea=By.xpath("//textarea[@autocorrect='off']");
	By runbtn=By.xpath("//button[contains(text(),'Run')]");
public void startfn()
{
    driver.findElement(start).click();
}
public void timefn()
{
	driver.findElement(time).click();
}
public void trylinkfn()
{
	driver.findElement(trylink).click();
}
public void txtareafn() throws IOException
{
	String code =XLUtils.getCellData(path, "Sheet1", 1, 0);

	driver.findElement(txtarea).sendKeys(code);
}
public void runfn()
{
driver.findElement(runbtn).click();	
driver.navigate().back();
driver.navigate().back();
driver.navigate().back();

}
}


