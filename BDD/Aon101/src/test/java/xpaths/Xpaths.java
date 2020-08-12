package xpaths;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpaths{

	WebDriver driver;

	By txt_logo = By.xpath("(//img[@class='logo'])[3]");
	By link_logo = By.xpath("(//a[@class = 'aon-heading-small aon-white'])[1]");
	public Xpaths(WebDriver driver) {
		this.driver = driver;
	}
	public void scrollDown() throws InterruptedException{
		WebElement element = driver.findElement(txt_logo);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);
		
	}
	public void findElement(){
		boolean name = driver.findElement(txt_logo).isDisplayed();
		System.out.println("Aon logo is identified -" +name);
	}
	
	public void findLink() throws InterruptedException {
		driver.findElement(link_logo).click();
		Thread.sleep(2000);
		String s = driver.getCurrentUrl();
		assertEquals(s, "https://www.aon.com.au/australia/default.jsp");
		driver.navigate().back();
	}

}