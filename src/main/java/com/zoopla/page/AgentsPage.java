package com.zoopla.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.TestBase;

public class AgentsPage extends TestBase {

	public void agentsText() {
		String results = driver.findElement(By.xpath("//div[@id ='content']/div/h1[@class ='bottom-half']")).getText();

		System.out.println("Agent Name :" + results);

	}

}