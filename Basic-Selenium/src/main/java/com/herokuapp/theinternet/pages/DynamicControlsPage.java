package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DynamicControlsPage extends BasePage {
	private By EnableButtonLocator = By.xpath("//form[@id='input-example']/button");
	private By TextboxLocator = By.xpath("//form[@id='input-example']/input");
	private By RemoveButtonLocator = By.xpath("//button[contains(text(),'Remove')]");
	private By CheckboxLocator = By.xpath("//input[@type='checkbox']");
	private By GoneMessageLocator = By.xpath("//p[contains(text(),'gone')]");
	private By AddButtonLocator = By.xpath("//button[contains(text(),'Add')]");
	private By BackMessageLocator = By.xpath("//p[contains(text(),'back')]");

	public DynamicControlsPage(WebDriver driver, Logger log) {

		super(driver, log);
	}

	public void ValidateTextbox() {
		click(EnableButtonLocator);
		waitForclickable(TextboxLocator, 10);
		type("test", TextboxLocator);
		Assert.assertEquals(find(TextboxLocator).getAttribute("value"), "test");
	}

	public void ValidateCheckbox() {
		click(RemoveButtonLocator);
		waitForvisibility(GoneMessageLocator, 10);
		click(AddButtonLocator);
		waitForvisibility(BackMessageLocator, 10);
		Assert.assertTrue(find(CheckboxLocator).isDisplayed());
	}
}
