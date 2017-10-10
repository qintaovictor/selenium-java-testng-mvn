package Academy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;
//Adding logs 
//Generating html reports
//Screenshots on failure
//JEnkins integration
public class validateLogin extends base{
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
@BeforeTest

public void initialize() throws IOException
{
	
	 driver =initializeDriver();
		
	driver.get(prop.getProperty("url"));
}
	
	@Test(dataProvider = "getData")
	
	public void validateLoginUser(String Username,String Password,String text) throws IOException
	{

		//one is inheritance
		// creating object to that class and invoke methods of it
		LandingPage l=new LandingPage(driver);
		l.getMySignin().click();
		LoginPage lg = new LoginPage(driver);
		lg.getEmail().clear();
		lg.getEmail().sendKeys(Username);
		lg.getPassword().clear();
		lg.getPassword().sendKeys(Password);
		
	
		log.info(text);
		lg.getRemember().click();
		log.info("*******Remember clicked*******");

		
		}
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	
	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data = new Object[2][3];
		// 0th row
		data[0][0] = "xxxxxx@msn.com";
		data[0][1] = "123456";
		data[0][2] = "Restrcited User";
		// 1st row
		data[1][0] = "xxxxxxx_user@163.com";
		data[1][1] = "12345678";
		data[1][2] = "Non restricted user";

		return data;

	}

	
}
