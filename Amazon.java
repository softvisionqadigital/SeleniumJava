package Scenarios;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon 
{
	static 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    WebElement Shoes=driver.findElement(By.id("twotabsearchtextbox"));
    Shoes.sendKeys("Shoes");
    Thread.sleep(3000);
    for(int i=0;i<2;i++) 
   
    {
    Shoes.sendKeys(Keys.ARROW_DOWN);	//Click on drop down menu
    }
    
    Shoes.sendKeys(Keys.ENTER);
    JavascriptExecutor jse = (JavascriptExecutor) driver;  
    jse.executeScript("window.scrollBy(0,5000)");
    
    for(int i=0;i<8;i++)
    {
    String xp="//span[@class='a-size-base-plus a-color-base a-text-normal']";
    List<WebElement> elem = driver.findElements(By.xpath(xp));
    for(WebElement ele:elem)
    {
    	System.out.println(ele.getText());
    }
   
    String xp1="//span[@class='a-price']";
    List<WebElement> price = driver.findElements(By.xpath(xp1));
    for(WebElement pr:price)
    {
    	System.out.println(pr.getText());
    }
   
    String next="//li[@class='a-last']";
    WebElement button = driver.findElement(By.partialLinkText("Next"));
    button.click();
    } 
	}
	
	
}  

