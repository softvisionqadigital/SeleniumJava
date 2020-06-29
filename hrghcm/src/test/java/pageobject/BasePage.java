package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	protected void waitforvisibility(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	protected WebElement find(By locator) {
		waitforvisibility(locator);
		return driver.findElement(locator);
	}

	protected void Click(By locator) {
		find(locator).click();
	}

	protected Select selectDropdown(By locator) {
		return new Select(find(locator));
	}
}
