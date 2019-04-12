package com.zoopla.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.TestBase;

public class PropertyDetails extends TestBase {
	@FindBy(xpath = "//a[@data-track-label= 'Agent block 1']/div/h4[@class = 'ui-agent__name']")
	WebElement agntNam;

	@FindBy(xpath = "//div[@class='ui-agent__logo']/img[contains(@class, 'js-lazy-loaded')]")
	WebElement agentsLogo;

	@FindBy(xpath = "//a[@class ='ui-link' and  @data-track-label='Agent phone number 1']")
	WebElement agentcntctnum;

	public PropertyDetails() {
		PageFactory.initElements(driver, this);

	}

	public void validateAgntname() {
		String agentText = agntNam.getText();
		System.out.println("Agent Name: " + agentText);

	}

	public void verifyContactnum() {
		String agntcntctTValue = agentcntctnum.getText();
		System.out.println("Agent Name: " + agntcntctTValue);
	}

	public boolean validateAgntsLogo() {
		return agentsLogo.isDisplayed();
	}

	public AgentsPage clickonAgntsName() throws Exception {
		Thread.sleep(2000);
		agntNam.click();
		return new AgentsPage();
	}

}
