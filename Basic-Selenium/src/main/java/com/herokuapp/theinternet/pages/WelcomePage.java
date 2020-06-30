package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {

	private String pageUrl = "http://the-internet.herokuapp.com/";
	private By formAuthLocator = By.linkText("Form Authentication");
	private By dynamicControlsLocator = By.linkText("Dynamic Controls");
	private By checkboxesLocator = By.linkText("Checkboxes");
	private By DropdownLocator = By.linkText("Dropdown");
	private By AlertsLocator = By.linkText("JavaScript Alerts");
	private By MultipleWindowsLocator = By.linkText("Multiple Windows");
	private By WYSIWYGEditorLocator = By.linkText("WYSIWYG Editor");
	private By KeyPressesLocator = By.linkText("Key Presses");
	private By FileUploadLocator = By.linkText("File Upload");
	private By DragandDropLocator = By.linkText("Drag and Drop");
	private By HoversLocator = By.linkText("Hovers");
	private By HorizontalSliderLocator = By.linkText("Horizontal Slider");

	public WelcomePage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	// open Welcomepage
	public void openpage() {
		log.info("Opening Homepage");
		openURL(pageUrl);
		log.info("Page opened");
	}

	public LoginPage ClickFormAuth() {
		log.info("Click Form Authentication");
		click(formAuthLocator);
		return new LoginPage(driver, log);
	}

	public DynamicControlsPage ClickDynamicControls() {
		log.info("Click Dynamic Controls");
		click(dynamicControlsLocator);
		return new DynamicControlsPage(driver, log);
	}

	public CheckboxesPage ClickCheckboxes() {
		log.info("Click Form Authentication");
		click(checkboxesLocator);
		return new CheckboxesPage(driver, log);
	}

	public DropdownPage ClickDropdown() {
		log.info("Click Dropdown");
		click(DropdownLocator);
		return new DropdownPage(driver, log);
	}

	public AlertsPage ClickAlerts() {
		log.info("Click JavaScript Alerts");
		click(AlertsLocator);
		return new AlertsPage(driver, log);
	}

	public WindowsPage ClickMultipleWindows() {
		log.info("Click Multiple Windows");
		click(MultipleWindowsLocator);
		return new WindowsPage(driver, log);
	}

	public EditorPage ClickWYSIWYGEditor() {
		log.info("Click WYSIWYG Editor");
		click(WYSIWYGEditorLocator);
		return new EditorPage(driver, log);
	}

	public KeyPressesPage ClickKeyPresses() {
		log.info("Click Key Presses");
		click(KeyPressesLocator);
		return new KeyPressesPage(driver, log);
	}

	public UploadPage ClickFileUpload() {
		log.info("Click File Upload");
		click(FileUploadLocator);
		return new UploadPage(driver, log);
	}

	public DragandDropPage ClickDragandDrop() {
		log.info("Click Drag and Drop");
		click(DragandDropLocator);
		return new DragandDropPage(driver, log);
	}

	public HoversPage ClickHovers() {
		log.info("Click Hovers");
		click(HoversLocator);
		return new HoversPage(driver, log);
	}

	public HorizontalSliderPage ClickHorizontalSlider() {
		log.info("Click Horizontal Slider");
		click(HorizontalSliderLocator);
		return new HorizontalSliderPage(driver, log);
	}
}
