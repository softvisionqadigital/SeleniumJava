package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextinXpath {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/index.php");
		//<a href="https://www.rahulshettyacademy.com">Courses</a>
		driver.findElement(By.xpath("//a[text()='Courses']")).click();
		driver.findElement(By.cssSelector("a[text()='Courses']")).click();

	}

}
