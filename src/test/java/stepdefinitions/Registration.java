package stepdefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucmber.api.java.en.Then;

public class Registration {

	public static void main(String[] args) {
		
		@Given("^User filed his informaiton$")
		public void i_open_app() throws Throwable {
			System.out.println("Filed his information");
		}
		
		@When("^I click on submit button$")
		public void i_navigate_to_button() throws Throwable {
			System.out.println(Navigated to Submit button);
		}
		
		@Then("^I validate the User text field$")
		public void i_validate_the_user_text_field() throws Throwable {
			System.out.println("Validated the Test Field");
		}
	}

}
