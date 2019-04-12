package com.zoopla.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.TestBase;

public class LandingPage extends TestBase {

	@FindBy(xpath = "//input[@id ='search-input-location']")
	WebElement searchbox;
	@FindBy(xpath = "//button[@id ='search-submit']")
	WebElement searchbutton;

	public LandingPage() throws IOException {
		PageFactory.initElements(driver, this);

	}

	public String landingPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String name) throws IOException {
		searchbox.sendKeys(name);
		searchbutton.click();

		return new HomePage();
	}

}
