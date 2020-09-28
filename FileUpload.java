package Scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload
{
	static
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException, AWTException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://encodable.com/uploaddemo/");
	
	String path="C:\\Users\\arpitha.v\\Pictures\\fileupload.txt";
	StringSelection sel = new StringSelection(path);
	
	driver.findElement(By.xpath("//input[@type='file']")).click();
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	
	Thread.sleep(2000);
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	Thread.sleep(2000);
	
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.close();
	
}
}
