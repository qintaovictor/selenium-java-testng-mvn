package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	
	public WebDriver driver;
	
	By email=By.cssSelector("[id='page_email']");
	By password=By.cssSelector("[id='page_password']");
	By login=By.cssSelector("[id='LoginPageButton']");
	By remember=By.id("RememberMeBox");

}
