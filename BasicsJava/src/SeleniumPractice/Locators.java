package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//WebElement search=driver.findElement(By.name("q"));
		//WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		//WebElement search=driver.findElement(By.cssSelector("input[name='q']"));
		driver.findElement(By.xpath("//body/div[2]/div/div/div/div/div[2]/div[2]/div/a")).click();
		WebElement search=driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input"));
		search.sendKeys("Testing");
		search.sendKeys(Keys.ENTER);
		driver.close();

	}

}
