package com.base;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;

public class Utility_Methods extends  initDriver {
	
	
	public Utility_Methods(){
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public static void takeScrnshot(WebDriver driver, String filepath) {
		try {
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			
			File DestFile=new File(filepath);
			
			FileUtils.copyFile(SrcFile, DestFile);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void _click(WebElement ele) {
		ele.click();
	}

}
