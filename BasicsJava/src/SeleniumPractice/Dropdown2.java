package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");	
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		
		//select adult
		WebElement adults=driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));		
		Select adult=new Select(adults);
		adult.selectByValue("2");
		
		//select Child
		WebElement Childs=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));		
		Select Child=new Select(Childs);
		Child.selectByValue("3");
		
		//select Infant
		
		WebElement Infants=driver.findElement(By.name("ctl00$mainContent$ddl_Infant"));		
		Select Infant=new Select(Infants);
		Infant.selectByValue("2");
		

	}

}
