package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AlertsPage extends BasePage {
	private By JSAlertLocator = By.xpath("//button[@onclick='jsAlert()']");
	private By JSConfirmLocator = By.xpath("//button[@onclick='jsConfirm()']");
	private By JSPromptLocator = By.xpath("//button[@onclick='jsPrompt()']");
	private By resultLocator = By.xpath("//p[@id='result']");
	private String JSAlertMessage = "You successfuly clicked an alert";
	private String JSAcceptMessage = "You clicked: Ok";
	private String JSDismissMessage = "You clicked: Cancel";
	private String JSPromptMessage = "You entered: test";
	private String JSPromptCancelMessage = "You entered: null";

	public AlertsPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void JSAlertTest() {
		click(JSAlertLocator);
		switchAlert().accept();
		VerifyResultMessage(JSAlertMessage);
	}

	public void JSConfirmTest() {
		click(JSConfirmLocator);
		switchAlert().accept();
		VerifyResultMessage(JSAcceptMessage);
		click(JSConfirmLocator);
		switchAlert().dismiss();
		VerifyResultMessage(JSDismissMessage);
	}

	public void JSPromptTest() {
		click(JSPromptLocator);
		switchAlert().sendKeys("test");
		switchAlert().accept();
		VerifyResultMessage(JSPromptMessage);
		click(JSPromptLocator);
		switchAlert().dismiss();
		VerifyResultMessage(JSPromptCancelMessage);
	}

	public void VerifyResultMessage(String message) {
		String actual = getContent(resultLocator);
		Assert.assertTrue(actual.contains(message));
	}
}
