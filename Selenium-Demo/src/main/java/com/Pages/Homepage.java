package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.initDriver;

public class Homepage extends initDriver {
	
	@FindBy(xpath="//*[@id=':1e']/div[1]")
	WebElement newform;
	
	public Homepage(){
		super();
		PageFactory.initElements(driver, this);
	}
	
	public FormPage addNewForm() throws InterruptedException{
		newform.click();
		Thread.sleep(1000);
		return new FormPage();
	}

}
