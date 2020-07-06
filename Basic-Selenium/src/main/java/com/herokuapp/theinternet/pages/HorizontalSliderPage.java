package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage {
	private By SliderLocator = By.xpath("//input[@type='range']");
	private By ValueLocator = By.xpath("//div[@class='sliderContainer']/span");

	public HorizontalSliderPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void MoveSlider(String value) {
		int steps = (int) (Double.parseDouble(value) / 0.5);
		for (int i = 0; i < steps; i++) {
			KeyPress(SliderLocator, Keys.ARROW_RIGHT);
		}
	}

	public void VerifyValue(String value) {
		String actual = getContent(ValueLocator);
		Assert.assertTrue(actual.contains((value)));
	}
}
