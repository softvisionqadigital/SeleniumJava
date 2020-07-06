package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	private By usernameLocator = By.name("username");
	private By passwordLocator = By.name("password");
	private By loginbtnLocator = By.xpath("//button[@class='radius']");
	private By messageLocator = By.xpath("//div[@class='row']/div/div[@id='flash']");

	LoginPage(WebDriver driver, Logger log) {

		super(driver, log);
	}

	public SecureAreaPage PositiveLogInTest(String username, String password) {
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(loginbtnLocator);
		return new SecureAreaPage(driver, log);
	}

	public void NegativeLogInTest(String username, String password) {
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(loginbtnLocator);
	}

	public String GetMessage() {
		return getContent(messageLocator);
	}
}
