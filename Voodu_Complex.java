package Scenarios;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Voodu_Complex
{
	static 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	     {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://voodumarketing.com.au/");
		 driver.manage().window().maximize();
		 
		 WebElement Service=driver.findElement(By.xpath("//a[@href='#'][@itemprop='url']"));
         //Mouse hover
		 Actions act=new Actions(driver);
	     act.moveToElement(Service).perform();
	     //wait
	     Thread.sleep(1000);
		 //Listing Sub Elements
	     WebElement All = driver.findElement(By.xpath("//ul[@class='sub-menu']"));
	     System.out.println(All.getText());
	     //Scroll down
	     JavascriptExecutor jse = (JavascriptExecutor) driver;  
	     jse.executeScript("window.scrollBy(0,5000)");
	     //wait
	     Thread.sleep(1000);
	     System.out.println();
	     
         List<WebElement> all=driver.findElements(By.xpath("//section//ul"));
         for(WebElement a:all)
         {
        	 System.out.println(a.getText()); 
        	 System.out.println();
	     } 
         driver.findElement(By.xpath("//a[@href='https://voodumarketing.com.au/contact/']//span[@class='avia-menu-text']")).click();
         
         JavascriptExecutor jse1 = (JavascriptExecutor) driver;  
	     jse1.executeScript("window.scrollBy(0,3000)");
         
         Voodu V=new Voodu(driver);
         
         Thread.sleep(1000);
         Voodu.First("Abc");
         Voodu.Last("V");
         Voodu.EmailId("arpitha.v@gmail.com");
         Voodu.Company("Sof");
         Voodu.PhoneNo("9874563210");
         Voodu.Help("Automating");
         Voodu.RadioB();
				 
		 driver.navigate().back();
		 
		 List<WebElement> Media= driver.findElements(By.xpath("//ul[contains(@class,'social_bookmarks')]//li"));
		 
		 for(int i=0;i<Media.size();i++)
		 {
			 
		 Media.get(i).click();
		 Set<String> allWindows = driver.getWindowHandles();
		 String parent = driver.getWindowHandle();
		 
		 Iterator<String> itr = allWindows.iterator();
		 while(itr.hasNext())
		 {
			 
	      String childWin=itr.next();
	      if(!parent.equals(childWin))
          {
	       driver.switchTo().window(childWin);
	       
	       System.out.println(driver.getTitle());
	       
	       Thread.sleep(1000);
	       
          }
	       driver.switchTo().window(parent);
          
		 }		
		 }	 
		 }
}
	
