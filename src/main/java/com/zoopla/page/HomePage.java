package com.zoopla.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.zoopla.base.TestBase;

public class HomePage extends TestBase {
	// @FindBy(xpath = "")
	// WebElement fifthEle;

	public HomePage() throws IOException {
		super();
	}

	public void resultsSort() throws Exception {

		Select s = new Select(driver.findElement(By.xpath("//select[@name ='results_sort']")));
		s.selectByValue("highest_price");

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//ul[@data-role= 'listview']/li[@id = 'listing_50889931']/div/div[2]/div[@class ='agent_logo']/following::a[contains(@href , '/for-sale/details/50889931') "
						+ "and @class = 'listing-results-price text-price']"))
				.click();

	}

}
