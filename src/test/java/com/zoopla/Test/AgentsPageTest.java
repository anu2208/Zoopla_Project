package com.zoopla.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.TestBase;
import com.zoopla.page.AgentsPage;
import com.zoopla.page.HomePage;
import com.zoopla.page.LandingPage;
import com.zoopla.page.PropertyDetails;

public class AgentsPageTest extends TestBase {
	LandingPage landingPage;
	HomePage homePage;
	PropertyDetails propDetails;
	String name;

	public AgentsPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		landingPage = new LandingPage();
		landingPage.login("London");
		homePage = new HomePage();
		homePage.resultsSort();
		propDetails = new PropertyDetails();
		propDetails.clickonAgntsName();

	}

	@Test

	public void agenttext() {
		AgentsPage agntPage = new AgentsPage();
		agntPage.agentsText();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
