package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test

	public void baseSearchForPhone() throws IOException {

		// one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getSearch().clear();
		l.getSearch().click();
		l.getSearch().sendKeys("iphone7 plus");
		l.getSearchButton().click();
	

	}

	@AfterTest
	public void teardown() {

		driver.close();
		driver = null;

	}


}
