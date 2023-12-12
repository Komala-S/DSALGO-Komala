package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base.Baseclass;
import Pages.ArrayPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array extends Baseclass {
	WebDriver driver;
	ArrayPage ap;
	LoginPage lp;
	
	
	public Array() {
		setWebDriver();
		this.driver = getDriver();
		ap = new ArrayPage(driver);
		lp=new LoginPage(driver);
	}	

	@Given("The user is in the Array page after logged in")
	public void the_user_is_in_the_array_page_after_logged_in() {

        lp.signLink();
        lp.loginCredentials("keerv", "Heat6er@123");
		lp.clickLoginBtn();
		ap.getstrtfn();
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		ap.getlinkfn();

	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) throws IOException {
		ap.tryarrayfn();
		ap.editorfn();
		ap.buttonfn();
		
	    	}

	@Given("The user is in the Arrays using List page after logged in")
	public void the_user_is_in_the_basic_operations_in_list_page_after_logged_in() {
		ap.link2fn();
		
		
	}

	@When("The user clicks {string} button in Arrays using List page")
	public void the_user_clicks_button_in_arrays_using_list_page(String string) {
		
		ap.tryarray1fn();

	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		ap.editor1fn();
		ap.button1();
		
	}

    @Given("The user is in the Basic Operations in Lists page after logged in")
	public void the_user_is_in_the_basic_operations_in_lists_page_after_logged_in() {
    	ap.link3fn();
    	ap.tryinarray2fn();
    	
	   	}

	@When("The user clicks {string} button in Basic Operations in Lists page")
	public void the_user_clicks_button_in_basic_operations_in_lists_page(String string) throws IOException {
		
		ap.editor2fn();
		ap.button2fn();
	}
	@Given("The user is in the Applications of Array page after logged in")
	public void the_user_is_in_the_applications_of_array_page_after_logged_in() {
		
		ap.link4fn();
		ap.tryinarray3fn();
	
	}


	@When("The user clicks {string} button in Applications of Array page")
	public void the_user_clicks_button_in_applications_of_array_page(String string) throws IOException {
		ap.editor3fn();
		ap.button3fn();
	}




}
