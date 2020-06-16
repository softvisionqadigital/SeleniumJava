package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsPage extends BasePage{
	private By ClickHereLinkLocator=By.xpath("//a[contains(text(),\"Click Here\")]");

	public WindowsPage(WebDriver driver, Logger log) {
		super(driver,log);
	}
	
	public void Clickink()
	{
		log.info("Click the Click Here Link");
		click(ClickHereLinkLocator);
	}
	
	public NewWindowsPage SwitchWindow() {
		log.info("Switch to New WIndow");
		SwitchToWindow("New Window");
		return new NewWindowsPage(driver,log);
	}
}
