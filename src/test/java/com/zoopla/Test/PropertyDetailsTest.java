package com.zoopla.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.TestBase;
import com.zoopla.page.HomePage;
import com.zoopla.page.LandingPage;
import com.zoopla.page.PropertyDetails;

public class PropertyDetailsTest extends TestBase {
	LandingPage landingPage;
	HomePage homePage;
	PropertyDetails propDetails;

	public PropertyDetailsTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		landingPage = new LandingPage();
		landingPage.login("London");
		homePage = new HomePage();
		homePage.resultsSort();

	}

	@Test(priority = 1)
	public void verifyAgentsName() {
		propDetails = new PropertyDetails();
		propDetails.validateAgntname();
	}

	@Test(priority = 2)
	public void verifyAgentslogo() {
		propDetails = new PropertyDetails();
		Assert.assertTrue(propDetails.validateAgntsLogo(), "logo not available");
	}

	@Test(priority = 3)
	public void verifyAgentscntctNum() {
		propDetails = new PropertyDetails();
		propDetails.verifyContactnum();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
