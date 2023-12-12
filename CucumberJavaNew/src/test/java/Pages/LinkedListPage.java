package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LinkedListPage {
	WebDriver driver;
	public LinkedListPage (WebDriver driver) {
		this.driver = driver;
	}

	By linkedliststart=By.xpath("(//a[contains(text(),'Get Started')])[3]");
	By list1=By.xpath("//a[contains(text(),'Introduction')]");
	By tryinlist1=By.xpath("//a[contains(text(),'Try here')]");
	By editorlist1=By.xpath("//textarea[@autocorrect='off']");
	By buttonlist1=By.xpath("//button[@type='button']");
	
	By list2=By.xpath("//a[contains(text(),'Creating Linked LIst')]");
	By tryinlist2=By.xpath("//a[contains(text(),'Try here')]");
	By editorlist2=By.xpath("//textarea[@autocorrect='off']");
	By buttonlist2=By.xpath("//button[@type='button']");
	
	By list3=By.xpath("//a[contains(text(),'Types of Linked List')]");
	By tryinlist3=By.xpath("//a[contains(text(),'Try here')]");
	By editorlist3=By.xpath("//textarea[@autocorrect='off']");
	By buttonlist3=By.xpath("//button[@type='button']");
	
	By list4=By.xpath("//a[contains(text(),'Implement Linked List in Python')]");
	By tryinlist4=By.xpath("//a[contains(text(),'Try here')]");
	By editorlist4=By.xpath("//textarea[@autocorrect='off']");
	By buttonlist4=By.xpath("//button[@type='button']");
	
	By list5=By.xpath("//a[contains(text(),'Traversal')]");
	By tryinlist5=By.xpath("//a[contains(text(),'Try here')]");
	By editorlist5=By.xpath("//textarea[@autocorrect='off']");
	By buttonlist5=By.xpath("//button[@type='button']");
	
	By list6=By.xpath("//a[contains(text(),'Insertion')]");
	By tryinlist6=By.xpath("//a[contains(text(),'Try here')]");
	By editorlist6=By.xpath("//textarea[@autocorrect='off']");
	By buttonlist6=By.xpath("//button[@type='button']");
	
	By list7=By.xpath("//a[contains(text(),'Deletion')]");
	By tryinlist7=By.xpath("//a[contains(text(),'Try here')]");
	By editorlist7=By.xpath("//textarea[@autocorrect='off']");
	By buttonlist7=By.xpath("//button[@type='button']");
	


public void linkedstartfn()
{
	driver.findElement(linkedliststart).click();
}
public void list1fn()
{
	driver.findElement(list1).click();
}
public void tryinlist1fn()
{
	driver.findElement(tryinlist1).click();
}
public void editorlist1fn() throws IOException
{
	//String listcode1=XLUtils.getCellData(path, "Sheet1", 1,0);

	driver.findElement(editorlist1).sendKeys("print 10");
}
public void buttonlist1fn()
{
	driver.findElement(buttonlist1).click();
	driver.navigate().back();
}
public void list2fn()
{
	driver.findElement(list2).click();
}
public void tryinlist2fn()
{
	driver.findElement(tryinlist2).click();
}
public void editorlist2fn() throws IOException
{
	//String listcode2=XLUtils.getCellData(path, "Sheet1", 1,0);

	driver.findElement(editorlist2).sendKeys("print 10");
}
public void buttonlist2fn()
{
	driver.findElement(buttonlist2).click();
	driver.navigate().back();
}
public void list3fn()
{
	driver.findElement(list3).click();
}
public void tryinlist3fn()
{
	driver.findElement(tryinlist3).click();
}
public void editorlist3fn() throws IOException
{
	//String listcode3=XLUtils.getCellData(path, "Sheet1", 1,0);

	driver.findElement(editorlist3).sendKeys("print 10");
}
public void buttonlist3fn()
{
	driver.findElement(buttonlist3).click();
	driver.navigate().back();
}
public void list4fn()
{
	driver.findElement(list4).click();
}
public void tryinlist4fn()
{
	driver.findElement(tryinlist4).click();
}
public void editorlist4fn() throws IOException
{
	//String listcode4=XLUtils.getCellData(path, "Sheet1", 1,0);

	driver.findElement(editorlist4).sendKeys("print 10");
}
public void buttonlist4fn()
{
	driver.findElement(buttonlist4).click();
	driver.navigate().back();
}
public void list5fn()
{
	driver.findElement(list5).click();
}
public void tryinlist5fn()
{
	driver.findElement(tryinlist5).click();
}
public void editorlist5fn() throws IOException
{
	//String listcode5=XLUtils.getCellData(path, "Sheet1", 1,0);

	driver.findElement(editorlist1).sendKeys("print 10");
}
public void buttonlist5fn()
{
	driver.findElement(buttonlist1).click();
	driver.navigate().back();
}
public void list6fn()
{
	driver.findElement(list6).click();
}
public void tryinlist6fn()
{
	driver.findElement(tryinlist6).click();
}
public void editorlist6fn() throws IOException
{
	//String listcode6=XLUtils.getCellData(path, "Sheet1", 1,0);

	driver.findElement(editorlist6).sendKeys("print 10");
}
public void buttonlist6fn()
{
	driver.findElement(buttonlist6).click();
	driver.navigate().back();
}
public void list7fn()
{
	driver.findElement(list7).click();
}
public void tryinlist7fn()
{
	driver.findElement(tryinlist7).click();
}
public void editorlist7fn() throws IOException
{
	//String listcode7=XLUtils.getCellData(path, "Sheet1", 1,0);

	driver.findElement(editorlist1).sendKeys("print 10");
}
public void buttonlist7fn()
{
	driver.findElement(buttonlist7).click();
	driver.navigate().back();
	driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();


}

}

