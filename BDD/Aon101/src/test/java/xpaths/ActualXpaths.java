package xpaths;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActualXpaths {
	WebDriver driver;
	
	@BeforeMethod
	public void launch_Browser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/abhi/Downloads/jar_files/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://aon-biw-dev.azurewebsites.net/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
	}
	@Test
	public void finding_Link() throws InterruptedException {
		
		 driver.findElement(By.xpath("(//a[@class = 'aon-heading-small aon-white'])[1]")).click();
		 Thread.sleep(5000);
		 String s = driver.getCurrentUrl();
		assertEquals(s, "https://www.aon.com.au/australia/default.jsp");
}
}