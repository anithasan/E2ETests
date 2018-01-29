package Academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class validateTitle extends Base 
{
	
	@Test
	
	public void basePageNavigation() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://www.graybar.com/store/en/gb");
		
		//one in inheritance
		//creating object to that class and invoke methods of it
		LandingPage lp = new LandingPage(driver);
		//compare the text fromn the browser with actual text.-Error
		Assert.assertEquals(lp.getTitle().getText(), "Featured Categories");
		Assert.assertTrue(condition);

		
	}
	

}
