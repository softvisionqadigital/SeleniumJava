package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility_Methods;
import com.base.initDriver;

public class LoginPage extends initDriver {
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement username;
	@FindBy(xpath="//*[@id='identifierNext']")
	WebElement nextbtn;
	@FindBy(xpath="//input[@name='password']")
	WebElement paswd;
	@FindBy(xpath="//*[@id='passwordNext']")
	WebElement pswdnxtBtn;
	
	public LoginPage(){
		
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public FormPage toLogin() throws InterruptedException{
		
		username.sendKeys(prop.getProperty("username"));
		nextbtn.click();
		paswd.sendKeys(prop.getProperty("password"));
		pswdnxtBtn.click();
		Thread.sleep(2000);
		Utility_Methods.takeScrnshot(driver, "src//test//resources//Screenshots//test.png");
		Thread.sleep(2000);
		return new FormPage();
	}

}
