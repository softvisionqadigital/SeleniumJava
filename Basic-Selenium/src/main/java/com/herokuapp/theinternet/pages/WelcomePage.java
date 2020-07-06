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
		openURL(pageUrl);
	}

	public LoginPage ClickFormAuth() {
		click(formAuthLocator);
		return new LoginPage(driver, log);
	}

	public DynamicControlsPage ClickDynamicControls() {
		click(dynamicControlsLocator);
		return new DynamicControlsPage(driver, log);
	}

	public CheckboxesPage ClickCheckboxes() {
		click(checkboxesLocator);
		return new CheckboxesPage(driver, log);
	}

	public DropdownPage ClickDropdown() {
		click(DropdownLocator);
		return new DropdownPage(driver, log);
	}

	public AlertsPage ClickAlerts() {
		click(AlertsLocator);
		return new AlertsPage(driver, log);
	}

	public WindowsPage ClickMultipleWindows() {
		click(MultipleWindowsLocator);
		return new WindowsPage(driver, log);
	}

	public EditorPage ClickWYSIWYGEditor() {
		click(WYSIWYGEditorLocator);
		return new EditorPage(driver, log);
	}

	public KeyPressesPage ClickKeyPresses() {
		click(KeyPressesLocator);
		return new KeyPressesPage(driver, log);
	}

	public UploadPage ClickFileUpload() {
		click(FileUploadLocator);
		return new UploadPage(driver, log);
	}

	public DragandDropPage ClickDragandDrop() {
		click(DragandDropLocator);
		return new DragandDropPage(driver, log);
	}

	public HoversPage ClickHovers() {
		click(HoversLocator);
		return new HoversPage(driver, log);
	}

	public HorizontalSliderPage ClickHorizontalSlider() {
		click(HorizontalSliderLocator);
		return new HorizontalSliderPage(driver, log);
	}
}
