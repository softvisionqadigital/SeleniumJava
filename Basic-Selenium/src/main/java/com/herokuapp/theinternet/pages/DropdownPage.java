package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {
	private By DropdownLocator = By.id("dropdown");

	public DropdownPage(WebDriver driver, Logger log) {

		super(driver, log);
	}

	public void SelectOption(int i) {
		Select dropdown = new Select(find(DropdownLocator));
		dropdown.selectByIndex(i);
	}

	public void ValidateDropdown() {
		Select dropdown = new Select(find(DropdownLocator));
		log.info(dropdown.getFirstSelectedOption().getText());
	}
}
