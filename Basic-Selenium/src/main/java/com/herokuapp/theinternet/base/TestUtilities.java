package com.herokuapp.theinternet.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

public class TestUtilities extends BaseFunctions {

	protected void waitMethod() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@DataProvider(name = "files")
	protected static Object[][] files() {
		return new Object[][] { { 1, "Chrysanthemum.jpg" }, { 2, "Desert.jpg" }, { 3, "test.txt" } };
	}

	protected void takeScreenshot(String fileName) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + File.separator + "test-output" + File.separator + "Screenshots"
				+ File.separator + getTodaysDate() + File.separator + testSuiteName + File.separator + testName
				+ File.separator + testmethodName + File.separator + getSystemTime() + " " + fileName + ".png";

		try {
			FileUtils.copyFile(file, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getTodaysDate() {
		return (new SimpleDateFormat("yyyymmdd").format(new Date()));
	}

	private static String getSystemTime() {
		return (new SimpleDateFormat("HHMMSS").format(new Date()));
	}
}
