package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
public class GoogleSearch
{
	WebDriver driver=null;
	@Given("Browser is open")
	public void browser_is_open() throws InterruptedException 
	{
		System.out.println("Browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Users/Abc/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@And("user is on search page")
	public void user_is_on_search_page() 
	{
		System.out.println("User is on Search page");
		driver.navigate().to("https://www.google.com");
	}
	@When("user is enter text in search box")
	public void useris_enter_text_in_search_box() throws InterruptedException
	{
		System.out.println("user is enter test in search box");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(3000);
	}
	@And("hits enter")
	public void hits_enter() throws InterruptedException
	{
		System.out.println("hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);	
		Thread.sleep(3000);
	}
	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results()
	{
		System.out.println("User is navigate on search result");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}
}
