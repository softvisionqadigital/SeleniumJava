package com.herokuapp.theinternet.base;

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
}
