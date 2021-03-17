package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {

	public WebDriver driver;
	 By books=By.xpath("//a[@href='/books']");
	 By Book1=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/h2/a");
	 By Qty=By.xpath("//input[@value='1']");
	 By AddtoCart=By.xpath("//input[@id='add-to-cart-button-45']");
	 By GotoCart=By.xpath("//input[@value='Go to cart']");
	 By Checkbox=By.xpath("//input[@name='termsofservice']");
	 By Checkout=By.xpath("//button[@id='checkout']");
	 By Billing=By.xpath("//input[@onclick='Billing.save()']");
	 //By Shipping=By.xpath("//input[@onclick='Shipping.save()']");
	// By Confirm=By.xpath("//input[@onclick='ConfirmOrder.save()']");
	 
	 

	 
	
	 





		public AddToCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		public WebElement getbooks()
		{
				 return driver.findElement(books);
				 
		}
		public WebElement getBook1()
		{
				 return driver.findElement(Book1);
				 
		}
		
		public WebElement Qty()
		{
				 return driver.findElement(Qty);
				 
}
		public WebElement AddtoCart()
		{
				 return driver.findElement(AddtoCart);
				 
}
		public WebElement GotoCart()
		{
				 return driver.findElement(GotoCart);
				 
}
		public WebElement Checkbox()
		{
				 return driver.findElement(Checkbox);
				 
}
		public WebElement Checkout()
		{
				 return driver.findElement(Checkout);
				 
}
		public WebElement Billing()
{
	 return driver.findElement(Billing);
} 
		/*public WebElement Shipping()
		{
			 return driver.findElement(Shipping);
		} 
	 */
	 
	 
	 
	 

	 
	 

}
