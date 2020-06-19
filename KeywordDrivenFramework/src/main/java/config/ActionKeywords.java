package config;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public static void InitiateBrowser() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("src//test//resources//Config");
			prop.load(file);
			System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void OpenUrl() {
		try {
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(Exception e) {
		}
	}
	
	public static void input_Email() {
		try {
			driver.findElement(By.name("identifier")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("identifier")).sendKeys(prop.getProperty("email"));
			Thread.sleep(1500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void input_password() {
		try {
			driver.findElement(By.name("password")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void click_PasswordNext() {
		try {
			driver.findElement(By.id("passwordNext")).click();
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitfor() {
		try {
			Thread.sleep(4000);
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void click_next() {
		try {
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void click_options() {
		try {
			driver.findElement(By.id("userNavigationLabel")).click();
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void click_logout() {
		try {
			
			driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']//a[@class='_54nc']")).click();
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser() {
		try {
			driver.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
