package com.herokuapp.theinternet.pages;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HoversPage extends BasePage {

	private By imgLocator = By.xpath("//img[@alt='User Avatar']");
	private String ViewProfileXpath = "(//a[contains(text(),'View profile')])";

	public HoversPage(WebDriver driver, Logger log) {

		super(driver, log);
	}

	public void HoverTests(int i) {
		List<WebElement> images = findAll(imgLocator);
		WebElement image = images.get(i - 1);
		Hover(image);
		image.findElement(By.xpath(ViewProfileXpath + "[" + i + "]")).click();
		Assert.assertTrue(getCurrentPageURL().contains("/users/" + i));
	}
}
