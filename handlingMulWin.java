package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMulWin
{
	static {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/popup.php");
		  driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		  
		  String win=driver.getWindowHandle(); //returns parent window name as string
		  System.out.println(win);
		  Set<String> winss=driver.getWindowHandles(); //Return number of windows opened by webdriver, return set of strings
		  Iterator<String> itr=winss.iterator();
		  {
			  while(itr.hasNext())
			  {
				  String childWindow=itr.next();
				  if(!win.equalsIgnoreCase(childWindow))
				  {
					  driver.switchTo().window(childWindow);
					  driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
					  driver.findElement(By.name("btnLogin")).click();
				  }
			  }
		  }
	}
}
