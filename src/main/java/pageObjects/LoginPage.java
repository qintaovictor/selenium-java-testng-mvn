package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By email=By.cssSelector("[id='page_email']");
	By password=By.cssSelector("[id='page_password']");
	By login=By.cssSelector("[id='LoginPageButton']");
	By remember=By.id("RememberMeBox");
	
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getRemember()
	{
		return driver.findElement(remember);
	}
	
	
	
}
