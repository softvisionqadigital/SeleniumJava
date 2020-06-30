package com.herokuapp.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.apache.logging.log4j.Logger;

public class NewWindowsPage extends BasePage {

	public NewWindowsPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void VerifyNewWindow() {
		log.info("Verify the title of New Window");
		String actualWindow = getCurrentPageTitle();
		Assert.assertTrue(actualWindow.contains("New Window"));
	}

}
