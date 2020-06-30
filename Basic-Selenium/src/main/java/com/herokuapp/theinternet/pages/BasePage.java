package com.herokuapp.theinternet.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	protected Logger log;

	public BasePage(WebDriver driver, Logger log) {
		this.driver = driver;
		this.log = log;
	}

	protected String getCurrentPageTitle() {
		return driver.getTitle();
	}

	protected String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}

	protected void openURL(String pageUrl) {
		driver.navigate().to(pageUrl);
		driver.manage().window().maximize();
	}

	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}

	protected List<WebElement> findAll(By locator) {
		return driver.findElements(locator);
	}

	protected void click(By locator) {
		waitForvisibility(locator, 10);
		find(locator).click();
	}

	protected void type(String text, By locator) {
		waitForvisibility(locator, 5);
		find(locator).sendKeys(text);
	}

	protected Alert switchAlert() {
		return driver.switchTo().alert();
	}

	protected void SwitchToWindow(String title) {

		String firstwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> windowsiterator = allwindows.iterator();

		while (windowsiterator.hasNext()) {
			String windowhandle = windowsiterator.next().toString();
			if (!windowhandle.equals(firstwindow)) {
				driver.switchTo().window(windowhandle);
				if (getCurrentPageTitle().equals(title)) {
					break;
				}
			}
		}
	}

	protected void SwitchtoIframe(By locator) {
		driver.switchTo().frame(find(locator));
	}

	protected void KeyPress(By locator, Keys key) {
		waitForvisibility(locator, 5);
		find(locator).sendKeys(key);
	}

	protected void DragandDrop(By from, By to) {
		// Actions action=new Actions(driver);
		// action.dragAndDrop(find(from),find(to));
		// action.clickAndHold(find(from)).moveToElement(find(to)).release(find(from)).perform();
		final String java_script = "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe"
				+ "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun"
				+ "ction(format,data){this.items[format]=data;this.types.append(for"
				+ "mat);},getData:function(format){return this.items[format];},clea"
				+ "rData:function(format){}};var emit=function(event,target){var ev"
				+ "t=document.createEvent('Event');evt.initEvent(event,true,false);"
				+ "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('"
				+ "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit("
				+ "'drop',tgt);emit('dragend',src);";

		((JavascriptExecutor) driver).executeScript(java_script, find(from), find(to));
	}

	protected String getContent(By locator) {
		waitForvisibility(locator, 10);
		return find(locator).getText();
	}

	protected void Hover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	protected void waitForvisibility(By locator, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	protected void waitForclickable(By locator, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
