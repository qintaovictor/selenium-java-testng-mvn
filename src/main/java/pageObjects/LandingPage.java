package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	By mySignin=By.id("LoginLink");
	By searchButton=By.className("icon-search-large");
	By register=By.xpath("//*[@id=\"NotLoggedInDiv\"]/a[1]");
	By watchlist=By.className("activities-button activities-button-wide");
	By favourites=By.className("activities-button activities-button-wide");
	By cart=By.className("cart-text");
	By search=By.id("searchString");
	By marketplace=By.id("SearchTabs1_MarketplaceAnchor");
	By jobs=By.id("SearchTabs1_JobsAnchor");
	By motors=By.id("SearchTabs1_MotorsAnchor");
	By property=By.id("SearchTabs1_PropertyAnchor");

	By mobilephone=By.id("SecondLevelCategoryCounts1_ctl03_CategorySearch");
	

	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getRegister()
	{
		return driver.findElement(register);
	}
	public WebElement getMySignin()
	{
		return driver.findElement(mySignin);
	}
	
	public WebElement getSearchButton()
	{
		return driver.findElement(searchButton);
	}
	
	public WebElement getWatchlist()
	{
		return driver.findElement(watchlist);
	}
	public WebElement getFavourites()
	{
		return driver.findElement(favourites);
	}
	public WebElement getCart()
	{
		return driver.findElement(cart);
	}
	public WebElement getMarketplace()
	{
		return driver.findElement(marketplace);
	}
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	public WebElement getJobs()
	{
		return driver.findElement(jobs);
	}
	public WebElement getMotors()
	{
		return driver.findElement(motors);
	}
	
	public WebElement getMobilePhone()
	{
		return driver.findElement(mobilephone);
	}
	
	
	public WebElement getProperty()
	{
		return driver.findElement(property);
	}
	
	
	
	
}
