package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		//chrome, //firefox//global environment
		//data driven 
		Properties prop = new Properties();
		
		//Reads any file given as input and put in the memory
		FileInputStream fis = new FileInputStream("C:\\Users\\ANITHASN\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		//Goes through the loaded filestream and creates name = value pairs
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			driver = new ChromeDriver();
				//execute in chrome driver
			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.13.0-win64");

			 driver = new FirefoxDriver();
		}
		else if (browserName.equals("IE"))
		{
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

	

	
	

}
