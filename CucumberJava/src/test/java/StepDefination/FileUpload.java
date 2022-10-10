package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class FileUpload 
{
	WebDriver driver= null;
	@Given("that the user is on upload file screen.")
	public void that_the_user_is_on_upload_file_screen() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Abc/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8806897397");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8806897397");
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(3000);
	    driver.close();
		driver.quit();
	}

	@When("a user clicks on the Browse button.")
	public void a_user_clicks_on_the_browse_button() 
	{
	    
	}

	@And("user enters <filename> onto the upload textbox.")
	public void user_enters_filename_onto_the_upload_textbox()
	{
	    
	}

	@And("user clicks on the enter button.")
	public void user_clicks_on_the_enter_button()
	{
	    
	}

	@Then("verify that the file upload is successful")
	public void verify_that_the_file_upload_is_successful() 
	{
	    
	}
}
