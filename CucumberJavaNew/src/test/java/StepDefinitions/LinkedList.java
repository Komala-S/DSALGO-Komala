package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base.Baseclass;
import Pages.LinkedListPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList extends Baseclass{
	
	WebDriver driver;
	LoginPage lp;
	LinkedListPage ll;
	
	
	public LinkedList() {
		setWebDriver();
		this.driver = getDriver();
		lp = new LoginPage(driver);
		ll=new LinkedListPage(driver);
	}	

	@Given("The user is in the Linked List  page after logged in")
	public void the_user_is_in_the_linked_list_page_after_logged_in() {
        lp.signLink();
        lp.loginCredentials("keerv", "Heat6er@123");
		lp.clickLoginBtn();
		ll.linkedstartfn();

	}

	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String string) throws IOException {
		ll.list1fn();
		ll.tryinlist1fn();
		ll.editorlist1fn();
		ll.buttonlist1fn();
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) throws IOException {
		
		ll.list2fn();
		ll.tryinlist2fn();
		ll.editorlist2fn();
	}

	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
		ll.buttonlist2fn();

		
	}

	@Given("The user is in the Creating a Linked List of Linked list page")
	public void the_user_is_in_the_creating_a_linked_list_of_linked_list_page() throws IOException {
		ll.list3fn();
		ll.tryinlist3fn();
		ll.editorlist3fn();
		ll.buttonlist3fn();
	}

	@Given("The user is in the Types of Linked List page")
	public void the_user_is_in_the_types_of_linked_list_page() throws IOException {
		ll.list4fn();
		ll.tryinlist4fn();
		ll.editorlist4fn();
		ll.buttonlist4fn();
	}

	@Given("The user is in the Implement Linked List in Python page")
	public void the_user_is_in_the_implement_linked_list_in_python_page() throws IOException {
		ll.list5fn();
		ll.tryinlist5fn();
		ll.editorlist5fn();
		ll.buttonlist5fn();
	}

	@Given("The user is in the Traversal page")
	public void the_user_is_in_the_traversal_page() throws IOException {
		ll.list6fn();
		ll.tryinlist6fn();
		ll.editorlist6fn();
		ll.buttonlist6fn();

	}
	

	@Given("The user is in the Insertion page")
	public void the_user_is_in_the_insertion_page() throws IOException {
		
		ll.list7fn();
		ll.tryinlist7fn();
		ll.editorlist7fn();
		ll.buttonlist7fn();
	}





}
