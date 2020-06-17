package com.learningDemo;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.initDriver;

public class FrameHandling_demo extends initDriver {
	
	public static Properties prop;
	static WebDriver driver;
	
	
	public void frameHandling() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("src//test//resources//Config");
			prop.load(file);
			System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.softwaretestinghelp.com/");
			 
			//Finding all iframe tags on a web page
			List<WebElement> elements = driver.findElements(By.tagName("iframe"));
			int numberOfTags = elements.size();
			System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
			System.out.println("Switching to the frame");
			driver.switchTo().frame(1);
			 
			// Print the frame source code
			System.out.println("Frame Source" +driver.getPageSource());
			 
			// Switch back to main web page
			driver.switchTo().defaultContent();
			
			//System.out.println("Frame Source" +driver.getPageSource());
			
			Thread.sleep(3000);
			driver.quit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
