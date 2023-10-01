package cloud.dash.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cloud.dash.testbase.DashboardTestbase;

public class DashboardLogin extends DashboardTestbase {
	
	public DashboardLogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "(//span[@class='Button-label Text-color--white Text-fontSize--16 Text-fontWeight--medium Text-lineHeight--28 Text-numericSpacing--proportional Text-typeface--base Text-wrap--noWrap Text-display--block'])[1]")
	private WebElement btnContinue;
	public void dashLogin() throws InterruptedException {
		// Valid Inputs and login
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		email.sendKeys("swapnil.patil@bakuun.com");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		password.sendKeys("123456!!");
		btnContinue.click();
	}
	
	public void accountScreen() 
	{	
		String accscreen = driver.findElement(By.xpath("//span[contains(text(),'Account settings')]")).getText();
		accscreen.equals("Account settings");
		System.out.println(accscreen);
	}
}
