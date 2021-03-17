package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
    public WebDriver driver; 
    public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Selenim Practice\\Project1\\src\\main\\java\\resources\\data.properties");
	     prop.load(fis);
	    String browserName=prop.getProperty("browser");
	
	
	if(browserName.equals("firefox"))
	{
	
		WebDriverManager.firefoxdriver().setup(); //launch firefox
		driver = new FirefoxDriver(); //open firefox browser
	}
		else if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup(); //launch chrome
			driver = new ChromeDriver(); //open chrome browser
}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}
}