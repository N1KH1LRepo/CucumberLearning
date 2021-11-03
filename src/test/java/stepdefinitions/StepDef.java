package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class StepDef {
	@Given("^User on Webapp$")
	public void user_On_webapp()throws Throwable {
		System.out.println("Webapp is open");
	}
	
	@When("^I enter username as \"([^\"]*\" and password as \"([^\"]*\"$")
	public void i_enter_username_and_password_as(String arg1, String arg2) throws Throwable {
		System.out.println(Enter username and password in the fields);
	}
	
	@When("^I submit login page$")
	public void i_submit_login_page() throws throwable {
		System.out.println("Clicked on Submit bvutton");
	}
	
	@Then("^I rediect to userhome page$")
	public void i_rediect_to_userhome_page() throws Throwable {
		System.out.println("Successfully Logged in ");
	}
	

}
