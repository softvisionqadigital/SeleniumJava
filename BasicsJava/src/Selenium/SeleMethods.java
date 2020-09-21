package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
