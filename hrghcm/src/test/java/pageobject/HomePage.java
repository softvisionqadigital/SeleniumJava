package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	By uid= By.name("txtUsername");
	By pwd= By.id("txtPassword");
	By loginBtn= By.cssSelector("input.button");
	
	public void login(String userName, String password) {
		
		find(uid).sendKeys(userName);
		find(pwd).sendKeys(password);
		Click(loginBtn);
	}
}
