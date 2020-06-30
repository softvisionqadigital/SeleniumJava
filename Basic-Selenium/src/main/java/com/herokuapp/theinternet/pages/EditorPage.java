package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditorPage extends BasePage {
	private By frameLocator = By.tagName("iframe");
	private By TextLocator = By.xpath("//body[@id='tinymce']/p");
	private String DefaultText = "Your content goes here.";

	public EditorPage(WebDriver driver, Logger log) {

		super(driver, log);
	}

	public void VerifyDefaultText() {
		log.info("Verify default Text in Editor");
		SwitchtoIframe(frameLocator);
		String actual = getContent(TextLocator);
		Assert.assertTrue(actual.contains(DefaultText));
	}

}
