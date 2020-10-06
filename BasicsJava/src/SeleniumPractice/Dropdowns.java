package SeleniumPractice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement drpselect=driver.findElement(By.cssSelector("select[id=first]"));
		Select drpdn=new Select(drpselect);
		
		System.out.println("hey theju! ,Enter on which basis u wanted the element to be selected: value or  index or visibletext");
		Scanner input=new Scanner(System.in);
		String userinput=input.nextLine();
		if(userinput.equals("index"))
		{	
		System.out.println("element selected by using index");
		drpdn.selectByIndex(2);
		}
		if(userinput.equals("value"))
		{
			System.out.println("element selected by using value");
			drpdn.selectByValue("Google");
		}
		if(userinput.equals("visibletext"))
		{
			System.out.println("element selected by using visible text");
			drpdn.selectByVisibleText("Yahoo");
		}

		
	}

}
