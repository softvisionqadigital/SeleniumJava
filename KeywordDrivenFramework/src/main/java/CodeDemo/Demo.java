package CodeDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static Properties prop;
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		prop = new Properties();
		FileInputStream file = new FileInputStream("src//test//resources//Config");
		prop.load(file);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("seleniumdemo331@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.name("pass")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("SeleniumDemo@123");
		Thread.sleep(1000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(4000);
		
		

	}

}
