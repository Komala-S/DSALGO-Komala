package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.Baseclass;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Baseclass {
	WebDriver driver;
	LoginPage lp;
	
	
	public Login() {
		setWebDriver();
		this.driver = getDriver();
		lp = new LoginPage(driver);
	}	
	
	@Given("User clicks the Signin link")
	public void user_clicks_the_signin_link() {
		driver.get("https://dsportalapp.herokuapp.com/home");
		lp.signLink();
	    
	}

	@When("user gives correct {string} and {string}")
	public void user_gives_correct_and(String string, String string2) {
		lp.loginCredentials(string, string2);
	    	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		lp.clickLoginBtn();
	    	}

	@Then("The user should be redirected to Homepage with the text displayed as You are logged in")
	public void the_user_should_be_redirected_to_homepage_with_the_text_displayed_as_you_are_logged_in() {
		lp.valloggedinpage();
	   
	}



}
