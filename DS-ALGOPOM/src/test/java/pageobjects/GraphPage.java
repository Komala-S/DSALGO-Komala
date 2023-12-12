package pageobjects;
import java.io.IOException;

import org.openqa.selenium.By;

import Tests.Base;

public class GraphPage extends Base {
	public static String path = "/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/src/test/java/Excel/excelfile.xlsx"; 

	By Graphstart=By.xpath("(//a[contains(text(),'Get Started')])[7]");
	By graphlink=By.xpath("(//a[contains(text(),'Graph')])[2]");
	By tryingraph1=By.xpath("//a[contains(text(),'Try here')]");
	By editorgraph1=By.xpath("//textarea[@autocorrect='off']");
	By buttongraph1=By.xpath("//button[@type='button']");
	
	By graphreplink=By.xpath("//a[contains(text(),'Graph Representations')]");
	By tryingraph2=By.xpath("//a[contains(text(),'Try here')]");
	By editorgraph2=By.xpath("//textarea[@autocorrect='off']");
	By buttongraph2=By.xpath("//button[@type='button']");
	
	
	public void graphstartfn()
	{
		driver.findElement(Graphstart).click();
	}
	public void graphlinkfn()
	{
		driver.findElement(graphlink).click();
	}
	public void trylink1fn()
	{
		driver.findElement(tryingraph1).click();
	}
	public void editorgraph1fn() throws IOException
	{
		String graphcode1 =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(editorgraph1).sendKeys(graphcode1);
	}
	public void buttongraph1fn()
	{
		driver.findElement(buttongraph1).click();
		driver.navigate().back();
		driver.navigate().back();
	}
	public void graphreplinkfn()
	{
		driver.findElement(graphreplink).click();
	}
	public void trylink2fn()
	{
		driver.findElement(tryingraph2).click();
	}
	public void editorgraph2fn() throws IOException
	{
		String graphcode2 =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(editorgraph2).sendKeys(graphcode2);
	}
	public void buttongraph2fn()
	{
		driver.findElement(buttongraph2).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

	}

 }

