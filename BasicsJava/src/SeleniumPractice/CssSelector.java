package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("username");
		///id="password"    >>  #id if we have the for the element
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		// class="button r4 wide primary"     >>  .classname if we have the classname in the element 
		//and if there are gaps in classname replace the dots (.) in the gaps
		// Ex : button r4 wide primary  >>>>> button.r4.wide.primary
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
		
	}

}
/// css selector is 10 times faster than Xpath and can be written with tag or without tag 
//   CSS selector >>>>>>      tagname[attribute='value']  [OR]  [attribute='value]  [OR] #id if we have the for the element 
//[ OR]  .classname if we have the classname in the element

// Xpath >>>>>>>>>>   //tagname[@attribute='value']    [OR]     //*[@attribute='value']