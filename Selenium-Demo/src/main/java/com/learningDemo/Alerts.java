package com.learningDemo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.initDriver;

public class Alerts extends initDriver {
	
	public static Properties prop;
	static WebDriver driver;
	
	public void handlingAlerts() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("src//test//resources//Config");
			prop.load(file);
			System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.testandquiz.com/selenium/testing.html");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
			Thread.sleep(1000);
			Alert alert  = driver.switchTo().alert();
			
			alert.accept();
			System.out.println("Alert popup accepted");
			driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
	          Thread.sleep(1000);
	          
		    Alert confirmBox = driver.switchTo().alert();
		    
		    confirmBox.dismiss(); 
		    System.out.println("Alert popup canceled");
		    
		    driver.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
