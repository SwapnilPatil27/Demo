package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	@Given("User is login page")
	public void user_is_login_page() 
	{
		System.out.println("User is on login page");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password()
	{
		System.out.println("User enter username and password");
	}

	@And("Click on login button")
	public void click_on_lohon_button() 
	{
		System.out.println("Click on login button");
	}

	@Then("User is navigate to home page")
	public void user_is_navigate_to_home_page() 
	{
		System.out.println("User is navigate on home page");
	}

}
