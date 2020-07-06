package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DragandDropPage extends BasePage {
	private By ColumnALocator = By.id("column-a");
	private By ColumnBLocator = By.id("column-b");
	private By ColumnBHeader = By.xpath("//div[@id='column-b']/header");

	public DragandDropPage(WebDriver driver, Logger log) {
		super(driver, log);

	}

	public void DragandDropA() {
		DragandDrop(ColumnALocator, ColumnBLocator);
	}

	public void VerifyDragandDrop() {
		String actual = getContent(ColumnBHeader);
		Assert.assertTrue(actual.contains("A"));
	}

}
