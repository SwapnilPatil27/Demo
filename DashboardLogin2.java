package cloud.dash.pagelayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cloud.dash.testbase.DashboardTestbase;

public class DashboardLogin2 extends DashboardTestbase {
	
	public DashboardLogin2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "(//span[@class='Button-label Text-color--white Text-fontSize--16 Text-fontWeight--medium Text-lineHeight--28 Text-numericSpacing--proportional Text-typeface--base Text-wrap--noWrap Text-display--block'])[1]")
	private WebElement btnContinue;

	
	public void dashLogin() throws InterruptedException 
	{
		
		Actions action = new Actions(driver);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		
		// textbox input using JS
		je.executeScript("arguments[0].value='swapnil.patil@bakuun.com';", email);	
		je.executeScript("arguments[0].value='123456!!';", password);
		
		//scroll up/down using JS
		je.executeScript("arguments[0].scrollIntoView();",password);
		je.executeScript("windows.scrollBy(0.250)","");
		je.executeScript("windows.scrollBy(0.-50)","");
		
		btnContinue.click();
		
		//right click 
		WebElement ele = driver.findElement(By.xpath("Abc"));
		action.contextClick(ele).perform();
		
		//double click 
		action.doubleClick(ele).perform();
		
		//drag and drop 
		action.dragAndDrop(ele, ele).build().perform();
		
		// Window handle
		
		String orignalwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("abc")).click();
		for(String WindowHandle:driver.getWindowHandles())
		{
			driver.switchTo().window(WindowHandle);
		}
		driver.close();
		driver.switchTo().window(orignalwindow);
		
		// web table handle
		List<WebElement> rows = driver.findElements(By.xpath("abc"));
		int rcount = rows.size();
		System.out.println("No of rows in table:"+ rcount);
		
		List<WebElement> cols = driver.findElements(By.xpath("abc"));
		int colcount = cols.size();
		System.out.println("No of rows in table:"+ colcount);
	}
}
