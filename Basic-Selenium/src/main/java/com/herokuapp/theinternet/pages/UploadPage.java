package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UploadPage extends BasePage {
	private By ChooseFileLocator = By.xpath("//input[@id='file-upload']");
	private By UploadButtonLocator = By.xpath("//input[@id='file-submit']");
	private By FileNameLocator = By.xpath("//div[@id='uploaded-files']");

	public UploadPage(WebDriver driver, Logger log) {

		super(driver, log);
	}

	public void UploadFile(String fileName) {
		String FilePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Files\\" + fileName;
		type(FilePath, ChooseFileLocator);
		click(UploadButtonLocator);
	}

	public void VerifyFile(String fileName) {
		String actual = getContent(FileNameLocator);
		Assert.assertTrue(actual.contains(fileName));
	}
}
