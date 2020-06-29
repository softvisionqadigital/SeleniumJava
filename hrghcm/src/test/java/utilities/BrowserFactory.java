package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	// Opening the browser

	public static WebDriver browser(String browserType) {
		if (browserType.equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.gecko.driver","C:\\Users\\Administer\\Desktop\\Abdul\\Automation\\geckodriver.exe");

			//https://opensource-demo.orangehrmlive.com/
			WebDriverManager.firefoxdriver().setup();

			return new FirefoxDriver();
		} else if (browserType.equalsIgnoreCase("chrome"))

		{
			// System.setProperty("webdriver.chrome.driver","C:\\Users\\Administer\\Desktop\\Abdul\\Automation\\chromedriver.exe");
			
			
			// WebDriverManager.chromedriver().driverVersion("81.0.4044.138").setup(); //Can mentione the driver version too with this step

			WebDriverManager.chromedriver().setup();

			return new ChromeDriver();
		}

		else {
			WebDriverManager.iedriver().setup();
			return new InternetExplorerDriver();
		}
	}
	
	
}
