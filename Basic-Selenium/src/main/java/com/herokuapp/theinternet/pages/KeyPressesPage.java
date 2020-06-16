package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class KeyPressesPage extends BasePage{
	
	private By MessageLocator=By.xpath("//p[@id='result']");
	private String message="You entered: ENTER";

	public KeyPressesPage(WebDriver driver, Logger log) {
		
		super(driver,log);
	}
	
	public void KeyPress()
	{
		log.info("Press Enter Key");
		KeyPress(Keys.ENTER);
	}
	
	public void VerifyKeyPressed()
	{
		log.info("Verify the Key Pressed");
		String actual=getContent(MessageLocator);
		Assert.assertTrue(actual.contains(message));
	}

}
