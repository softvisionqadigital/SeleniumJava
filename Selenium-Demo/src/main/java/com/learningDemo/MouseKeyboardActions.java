package com.learningDemo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.base.initDriver;

public class MouseKeyboardActions extends initDriver {
	
	public static Properties prop;
	static WebDriver driver;
	
	public void mouseAndKeyboardActions() {
		try {
			
			prop = new Properties();
			FileInputStream file = new FileInputStream("src//test//resources//Config");
			prop.load(file);
			System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://www.facebook.com/");
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			
			WebElement txtUsername = driver.findElement(By.id("email"));

			Actions builder = new Actions(driver);
			Action seriesOfActions = builder
					.moveToElement(txtUsername)
					.click()
					.keyDown(txtUsername, Keys.SHIFT)
					.sendKeys(txtUsername, "hello")
					.keyUp(txtUsername, Keys.SHIFT)
					.doubleClick(txtUsername)
					.contextClick()
					.build();
					
				seriesOfActions.perform() ;
				
				driver.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
