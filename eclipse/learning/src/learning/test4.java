package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
        String baseUrl = "http://google.com";
        driver.manage().window().maximize();

        driver.get(baseUrl);
        
        WebElement search = driver.findElement(By.name("q"));
        
        search.sendKeys("searchkey");
        System.out.println("Entered on the search feild");
        search.clear();
        System.out.println("Cleared on search feild");
        
        List<WebElement> buttons = driver.findElements(By.xpath("//input[@type='submit']"));
        
        System.out.println("The Nuber of buttons in the Google Search page are "+ buttons.size());
        
        for (int i=0; i<= buttons.size(); i++) 
        		{
        	System.out.println("The button"+ i + "is : "+ buttons.get(i).getAttribute("value"));
        		}
        
        
        driver.close();
        driver.quit();
        

	}

}
