package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test3 {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
        String baseUrl = "http://demo.guru99.com/test/ajax.html";
        driver.manage().window().maximize();

        driver.get(baseUrl);
        
     // Find the radio button for “No” using its ID and click on it
        driver.findElement(By.id("no")).click();
        	
        //Click on Check Button
        driver.findElement(By.id("buttoncheck")).click();
        
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" +elements.size());

        for (int i=0; i<elements.size();i++)
        {
          System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }
        
        driver.close();
        driver.quit();
        
	}

}
