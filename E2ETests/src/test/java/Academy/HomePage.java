package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base 
{
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String email,String password,String text) throws IOException
	{
		driver = initializeDriver();
		driver.get("https://www.graybar.com/store/en/gb");
		
		//one in inheritance
		//creating object to that class and invoke methods of it
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		//constructor
		LoginPage lpage = new LoginPage(driver);
		lpage.getEmail().sendKeys(email);
		lpage.getPassword().sendKeys(password);
		//System.out.println(text);
		
		lpage.getSignin().click();
		
	}
	@DataProvider
	//data driven parametrization
	public Object[][] getData()
	{
		
		//creat an array//row stand for how many different datatypes test should run
		//column stand for how many values per each test
		//three arguments should be passedon basepagenavigation
		Object[][] data=new Object[2][3];
		//oth row
		data[0][0] = "anithasn@yahoo.com";
		data[0][1] = "graybar123";
		//data[0][2] ="Non Restricted user";
		//1st row
		data[1][0] = "nonrestricteduser@qw.com";
		data[1][1] = "456788";
		data[1][2] ="Restricted user";
		
		return data;
 	}

}
