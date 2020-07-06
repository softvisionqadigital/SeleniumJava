package com.herokuapp.theinternet.base;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners({com.herokuapp.theinternet.base.TestListeners.class})
public class BaseFunctions {

	protected WebDriver driver;
	protected Logger log;

	protected String testSuiteName;
	protected String testName;
	protected String testmethodName;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void intializeDriver(Method method, String browser, ITestContext ctx) {
		String testName = ctx.getCurrentXmlTest().getName();
		log = LogManager.getLogger(testName);
		BrowserDriverFactory factory = new BrowserDriverFactory(browser, log);
		driver = factory.createDriver();

		this.testSuiteName = ctx.getSuite().getName();
		this.testName = testName;
		this.testmethodName = method.getName();
	}

	@AfterMethod(alwaysRun = true)
	public void closeDriver() {
		log.info("Close driver");
		driver.quit();
	}

}
