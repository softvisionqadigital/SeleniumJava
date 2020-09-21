package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://qaclickacademy.com/index.php");
System.out.println(driver.findElement(By.xpath("//li[@class='active']")).getText());
System.out.println(driver.findElement(By.xpath("//li[@class='active']/following-sibling::li[1]")).getText());
System.out.println(driver.findElement(By.xpath("//li[@class='active']/following-sibling::li[2]")).getText());
System.out.println(driver.findElement(By.xpath("//li[@class='active']/following-sibling::li[3]")).getText());
System.out.println(driver.findElement(By.xpath("//li[@class='active']/following-sibling::li[4]")).getText());
System.out.println(driver.findElement(By.xpath("//li[@class='active']/parent::ul")).getText());
driver.close();


	}

}
