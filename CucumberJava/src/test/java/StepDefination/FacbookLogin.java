package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class FacbookLogin
{
	WebDriver driver=null;
	@When("I go to the home page")
	public void i_go_to_the_home_page() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Abc/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	@And("I press Connect your Facebook account")
	public void i_press_connect_your_facebook_account() throws InterruptedException 
	{
		System.out.println("User is navigate on login screen");
		Thread.sleep(3000);
	}
	@And("I fill in 8806897397 for Email")
	public void i_fill_in_8806897397_for_email() 
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8806897397");
	    
	}
	@And("I fill in 8806897397 for Password")
	public void i_fill_in_8806897397_for_password()
	{
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8806897397");
	}

	@And("I press Login")
	public void i_press_login() throws InterruptedException 
	{
		driver.findElement(By.name("login")).click();
	    Thread.sleep(3000);
	}
	@Then("I should be on the dashboard page")
	public void i_should_be_on_the_dashboard_page()
	{
		driver.close();
		driver.quit();
	}
}
