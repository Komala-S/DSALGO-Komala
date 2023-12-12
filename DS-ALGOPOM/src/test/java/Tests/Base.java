package Tests;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.Array;
import pageobjects.DatastructurePage;
import pageobjects.GraphPage;
import pageobjects.LinkedLists;
import pageobjects.LoginPage;
import pageobjects.QueuePage;
import pageobjects.RegisterPage;
import pageobjects.StackPage;
import pageobjects.TreePage;
import pageobjects.XLUtils;

public class Base {
	public static WebDriver driver=null;


	@Parameters("browser")
	@BeforeTest
	public void setup(String browser)
	{

		if(browser.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();

			driver=new ChromeDriver();
			
		}
		driver.get("https://dsportalapp.herokuapp.com");
		driver.manage().window().maximize();
		
	}
@Test(priority=1)	
public void register() throws IOException
{


	RegisterPage regobj=new RegisterPage();
	//regobj.getstartedfn();
	regobj.registerfn();
    regobj.usernamefn();
	regobj.passfn();
	regobj.pass1fn();
	regobj.submitfn();
	
}
@Test(priority=0)
public void invalid() throws IOException 
{
	LoginPage loginobj=new LoginPage();
	loginobj.getstartedfn();
	loginobj.signinfn();
	loginobj.invaliduserfn();
    loginobj.invalidpwd();
	loginobj.loginfn();
    loginobj.invalidloginfn();
}
//@Test(priority=2)
public void login() throws IOException
{
	LoginPage loginobj=new LoginPage();

	loginobj.signinfn();
    loginobj.userfn();
	loginobj.passwdfn();
	loginobj.loginfn();
}
@Test(priority=2)
public void datastructure() throws IOException
{
	DatastructurePage dataobj=new DatastructurePage();
	dataobj.startfn();
	dataobj.timefn();
	dataobj.trylinkfn();
	dataobj.txtareafn();
	dataobj.runfn();
	
}
@Test(priority=3)
public void array() throws IOException
{
	Array arrayobj=new Array();
	arrayobj.getstrtfn();
	arrayobj.getlinkfn();
	arrayobj.tryarrayfn();
	arrayobj.editorfn();
	arrayobj.buttonfn();
	
	arrayobj.link2fn();
	arrayobj.tryarray1fn();
	arrayobj.editor1fn();
	arrayobj.button1();
	
	arrayobj.link3fn();
	arrayobj.tryinarray2fn();
	arrayobj.editor2fn();
	arrayobj.button2fn();
	
	arrayobj.link4fn();
	arrayobj.tryinarray3fn();
	arrayobj.editor3fn();
	arrayobj.button3fn();
	}
@Test(priority=4)
public void Graph() throws IOException
{
GraphPage graphobj=new GraphPage();	
graphobj.graphstartfn();
graphobj.graphlinkfn();
graphobj.trylink1fn();
graphobj.editorgraph1fn();
graphobj.buttongraph1fn();

graphobj.graphreplinkfn();
graphobj.trylink2fn();
graphobj.editorgraph2fn();
graphobj.buttongraph2fn();

}
@Test(priority=5)
public void Stack() throws IOException
{
	StackPage stackobj=new StackPage();
	stackobj.stackstartfn();
	stackobj.stacklink1fn();
	stackobj.tryinstack1fn();
    stackobj.editorstack1fn();
	stackobj.buttonstack1fn();
	
	stackobj.stacklink2fn();
	stackobj.tryinstack2fn();
	stackobj.editorstack2fn();
	stackobj.buttonstack2fn();
	
	stackobj.stacklink3fn();
	stackobj.tryinstack3fn();
    stackobj.editorstack3fn();
    stackobj.buttonstack3fn();
	
}
@Test(priority=6)
public void Queue() throws IOException
{
	QueuePage queueobj=new QueuePage();
	queueobj.queuestartfn();
	queueobj.queuelink1fn();
	queueobj.queuetry1fn();
	queueobj.editorqueue1fn();
    queueobj.buttonqueue1fn();
    
    queueobj.queuelink2fn();
	queueobj.queuetry2fn();
	queueobj.editorqueue2fn();
    queueobj.buttonqueue2fn();
    
    
    queueobj.queuelink3fn();
	queueobj.queuetry3fn();
	queueobj.editorqueue3fn();
    queueobj.buttonqueue3fn();
    
    queueobj.queuelink4fn();
	queueobj.queuetry4fn();
	queueobj.editorqueue4fn();
    queueobj.buttonqueue4fn();
 }
@Test(priority=7)
public void LinkedList() throws IOException
{
	LinkedLists listobj=new LinkedLists();
	listobj.linkedstartfn();
	listobj.list1fn();
	listobj.tryinlist1fn();
	listobj.editorlist1fn();
	listobj.buttonlist1fn();
	
	listobj.list2fn();
	listobj.tryinlist2fn();
	listobj.editorlist2fn();
	listobj.buttonlist2fn();
	
	listobj.list3fn();
	listobj.tryinlist3fn();
	listobj.editorlist3fn();
	listobj.buttonlist3fn();
	
	listobj.list4fn();
	listobj.tryinlist4fn();
	listobj.editorlist4fn();
	listobj.buttonlist4fn();
	
	listobj.list5fn();
	listobj.tryinlist5fn();
	listobj.editorlist5fn();
	listobj.buttonlist5fn();
	
	listobj.list6fn();
	listobj.tryinlist6fn();
	listobj.editorlist6fn();
	listobj.buttonlist6fn();
	
	listobj.list7fn();
	listobj.tryinlist7fn();
	listobj.editorlist7fn();
	listobj.buttonlist7fn();
	
}
@Test(priority=8)
public void Tree() throws IOException
{
	TreePage treeobj=new TreePage();
	treeobj.treestartfn();
	treeobj.tree1fn();
	treeobj.tree2fn();
	treeobj.tree3fn();
	treeobj.tree4fn();
	treeobj.tree5fn();
	treeobj.tree6fn();
	treeobj.tree7fn();
	treeobj.tree8fn();
	treeobj.tree9fn();
	treeobj.tree10fn();
	treeobj.tree11fn();
	treeobj.tree12fn();
    treeobj.tree13fn();
}
@AfterTest
public void close()
{
	driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
	driver.quit();
}
}
