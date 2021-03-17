package Ecommerce.Project1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCart;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	@Test
	public void baseNavigation() throws IOException
	{
		
		driver = initializeDriver();
		
		driver.get(prop.getProperty("URL"));; //Navigate to URL : http://demowebshop.tricentis.com/
		driver.manage().window().maximize();

		LandingPage l = new LandingPage(driver);
		l.getLogin().click();   //Click on Login button

		if (driver.getPageSource().contains("Welcome, Please Sign In!")) {
			System.out.println("Text is present");
		} else {
			System.out.println("Text is not present"); //Validate “Welcome, Please Sign In!” message
		}

		LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys("testdemowebshop@gmail.com");
		lp.getpassword().sendKeys("Test123");
		lp.submit().click();
		Assert.assertTrue(lp.account().isDisplayed());
      
        AddToCart Ac = new AddToCart(driver);
        Ac.getbooks().click();
        Ac.getBook1().click();
        Ac.Qty().sendKeys("3");
        Ac.AddtoCart().click();
        String expected="The product has been added to shopping cart"; // used for validate “The product has been added to shopping cart” message

		Assert.assertEquals("The product has been added to shopping cart", expected);

		Actions a = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//span[@class='cart-label']"));
		a.moveToElement(target).build().perform();
		Ac.GotoCart().click();
		Ac.Checkbox().click();
		Ac.Checkout().click();
		Ac.Billing().click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		 
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='Shipping.save()']")));
		element.click();
		WebElement element2=wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ShippingMethod.save()']"))));
		element2.click();
		WebElement element3=wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentMethod.save()']"))));
		element3.click();
		WebElement element4=wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentInfo.save()']"))));
		element4.click();

		WebElement element5=wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ConfirmOrder.save()']"))));
		element5.click();
		String success="Your order has been successfully processed!"; // used for validate “The product has been added to shopping cart” message

		Assert.assertEquals("Your order has been successfully processed!", success);
		WebElement element6=wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Continue']"))));
		element6.click();
		driver.quit(); 
    	
	}
	
	
	
	
}


