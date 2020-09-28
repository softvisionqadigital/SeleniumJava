package seleniumPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton
{
	static {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		 // String xp="//p[text()='Click on button to get the selected value']";
		  WebElement ele= driver.findElement(By.className("radio-inline"));
		//  for(WebElement el:ele)
		  ele.click();
		 // driver.close();
	}
}

