package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.LoginPage;
import com.learningDemo.FrameHandling_demo;

public class initDriver {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public initDriver(){
		try{
			prop = new Properties();
			FileInputStream file = new FileInputStream("src//test//resources//Config");
			prop.load(file);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e2) {
			e2.printStackTrace();
		}
	}
	
	public LoginPage initializeDriver(){
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new LoginPage();
		
		
	}
	
	public FrameHandling_demo launchUdemy() {
		
			System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("udemyUrl"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return new FrameHandling_demo();
		
		
	}
	
	

}
