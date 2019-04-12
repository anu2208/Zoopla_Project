package com.zoopla.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.TestBase;
import com.zoopla.page.LandingPage;

public class LoginPageTest extends TestBase {
	LandingPage landingPage;

	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		landingPage = new LandingPage();
	}

	@Test
	public void searchCity() throws Exception {
		landingPage.login("London");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
