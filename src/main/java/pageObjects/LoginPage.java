package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	 By email=By.xpath("//input[@autofocus='autofocus']");
	 By password=By.xpath("//input[@class='password']");
	 By submit=By.xpath("//input[@value='Log in']");
	 By account=By.xpath("//a[@class='account']");

	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getemail()
	{
			 return driver.findElement(email);
			 
	}
	public WebElement getpassword()
	{
			 return driver.findElement(password);
			 
	}
	
	public WebElement submit()
	{
			 return driver.findElement(submit);
			 
	}
	public WebElement account()
	{
			 return driver.findElement(account);
			 
	}
}
