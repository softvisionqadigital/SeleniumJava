package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(9000);
		WebElement Fromcity=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
		Fromcity.click();
		Select city1=new Select(Fromcity);
		city1.selectByIndex(5);
		driver.findElement(By.xpath("")).click();	
		//select[@id='ctl00_mainContent_ddl_originStation1']
		
		}		
}
//M9/cvlug
