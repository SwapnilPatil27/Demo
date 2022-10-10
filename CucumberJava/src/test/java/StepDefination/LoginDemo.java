package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemo
{
	WebDriver driver = null;
	@Given("user navigates to SOFTWARETESTINGHELP.COM")
	public void user_navigates_to_softwaretestinghelp_com() 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Abc/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestinghelp.com/");
	}

	@When("user logs in using Username as <username> and Password <password>")
	public void user_logs_in_using_username_as_username_and_password_password() 
	{
	    
	}

	@Then("login should be successful")
	public void login_should_be_successful(io.cucumber.datatable.DataTable dataTable)
	{
		driver.close();
		driver.quit();
	   
	}

}
