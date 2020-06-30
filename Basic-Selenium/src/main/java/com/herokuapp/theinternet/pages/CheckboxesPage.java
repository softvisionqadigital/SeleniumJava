package com.herokuapp.theinternet.pages;

import java.util.List;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage extends BasePage {
	// private By checkboxLocator=By.xpath("//input[@type='checkbox']");
	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkboxes;

	public CheckboxesPage(WebDriver driver, Logger log) {

		super(driver, log);
		PageFactory.initElements(driver, this);
	}

	public void ClickCheckboxes() {
		log.info("Tick All checkboxes");
		// List <WebElement> checkboxes=findAll(checkboxLocator);
		for (WebElement checkbox : checkboxes) {
			if (!(checkbox.isSelected())) {
				checkbox.click();
			}
		}
	}

	public boolean VerifyCheckboxes() {
		log.info("Verify All checkboxes are ticked");
		// List <WebElement> checkboxes=findAll(checkboxLocator);
		for (WebElement checkbox : checkboxes) {
			if (!(checkbox.isSelected())) {
				return false;
			}
		}
		return true;
	}

}
