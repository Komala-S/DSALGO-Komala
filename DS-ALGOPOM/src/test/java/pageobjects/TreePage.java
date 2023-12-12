package pageobjects;
import java.io.IOException;

import org.openqa.selenium.By;

import Tests.Base;

public class TreePage extends Base {
	public static String path = "/Users/komalamathibal/eclipse-workspace/DS-ALGOPOM/src/test/java/Excel/excelfile.xlsx"; 

	By treestarted=By.xpath("(//a[contains(text(),'Get Started')])[6]");
	By treelink1=By.xpath("//a[contains(text(),'Overview of Trees')]");
	By treelink2=By.xpath("//a[contains(text(),'Terminologies')]");
	By treelink3=By.xpath("//a[contains(text(),'Types of Trees')]");
	By treelink4=By.xpath("//a[contains(text(),'Tree Traversals')]");
	By treelink5=By.xpath("//a[contains(text(),'Traversals-Illustration')]");
	By treelink6=By.xpath("//a[contains(text(),'Binary Trees')]");
	By treelink7=By.xpath("//a[contains(text(),'Types of Binary Trees')]");
	By treelink8=By.xpath("//a[contains(text(),'Implementation in Python')]");
	By treelink9=By.xpath("//a[contains(text(),'Binary Tree Traversals')]");
	By treelink10=By.xpath("//a[contains(text(),'Implementation of Binary Trees')]");
	By treelink11=By.xpath("//a[contains(text(),'Applications of Binary trees')]");
	By treelink12=By.xpath("//a[contains(text(),'Binary Search Trees')]");
	By treelink13=By.xpath("//a[contains(text(),'Implementation Of BST')]");

	By tryintree=By.xpath("//a[contains(text(),'Try here')]");
	By editortree=By.xpath("//textarea[@autocorrect='off']");
	By buttontree=By.xpath("//button[@type='button']");
	
	
	public void treestartfn()
	{
		driver.findElement(treestarted).click();
		
	}
	public void tree1fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink1).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree2fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink2).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree3fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink3).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree4fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink4).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree5fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink5).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree6fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink6).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree7fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink7).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree8fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink8).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree9fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink9).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree10fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink10).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree11fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink11).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree12fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink12).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
	}
	public void tree13fn() throws IOException

	{
		String treecode =XLUtils.getCellData(path, "Sheet1", 1, 0);

		driver.findElement(treelink13).click();
		driver.findElement(tryintree).click();
		driver.findElement(editortree).sendKeys(treecode);
		driver.findElement(buttontree).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

	}

}
