package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

	private By messageLocator = By.xpath("//div[@class='row']/div/div[@id='flash']");
	private By LogoutLocator = By.xpath("//div[@class='example']/a");

	public SecureAreaPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public String GetMessage() {
		return getContent(messageLocator);
	}

	public void Logout() {
		click(LogoutLocator);
	}
}
