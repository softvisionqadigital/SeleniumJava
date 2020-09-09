package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 String baseUrl = "https://support.tricentis.com/community/home.do";	        

	        driver.get(baseUrl);
	       driver.findElement(By.linkText("LOGIN/REGISTER")).click();
	       driver.switchTo().activeElement();
	       driver.findElement(By.id("user_name")).sendKeys("username");
	     WebElement password=  driver.findElement(By.id("user_password"));
	     System.out.println(password+"printing password");
	    		 password.sendKeys("password");
	    		 password.sendKeys(Keys.ENTER);
	       //driver.findElement(By.id("login_button_inner")).click();
	    		 Thread.sleep(2000);
	    		 String select = Keys.chord(Keys.CONTROL, "ENTER");
	    		 WebElement Downloads=	 driver.findElement(By.linkText("Downloads"));
	    				Downloads.sendKeys(select);
	    		
	    		

	}

}
