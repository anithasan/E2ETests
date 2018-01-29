package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("#globalLoginTextDesktop");
	By title=By.xpath("//*[@id='container_3074457345618269310']/div[2]/div/div[2]/div[1]/div/span");
	
	//"a[href*='Sign In']");
	//constructor
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	//there is no life in driver
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}

	
}
