package com.learningDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.initDriver;

public class WindowsHandling extends initDriver {
	
	public static Properties prop;
	static WebDriver driver;
	
	
	public void HandlingMultipleWindows() throws IOException, InterruptedException {
		prop = new Properties();
		FileInputStream file = new FileInputStream("src//test//resources//Config");
		prop.load(file);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com/");
		
		String mainWindow=driver.getWindowHandle();
		
		 Set<String> set =driver.getWindowHandles();
		 System.out.println(set.size());
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext()){
		 String childWindow=itr.next();
		 if(!mainWindow.equals(childWindow)){
			 driver.switchTo().window(childWindow);
			 System.out.println(driver.switchTo().window(childWindow).getTitle());
			 driver.close();
			 }
			 }
		 driver.switchTo().window(mainWindow);
		 Thread.sleep(2000);
		 driver.quit();
	}

}
