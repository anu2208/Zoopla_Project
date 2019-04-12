package com.zoopla.Test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.TestBase;
import com.zoopla.page.HomePage;
import com.zoopla.page.LandingPage;
import com.zoopla.page.PropertyDetails;

public class HomePageTest extends TestBase {
	LandingPage landingPage;

	PropertyDetails propDetails;

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		landingPage = new LandingPage();
		landingPage.login("London");

	}

	@Test
	public void sortTheResults() throws Exception {
		HomePage homePage = new HomePage();
		homePage.resultsSort();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
