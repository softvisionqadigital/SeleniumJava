package stepDefinitions;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class LoginSteps {
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	@Given("^user Navigates to guru99 bank Website$")				
    public void LaunchApplication() throws Throwable							
    {		
		prop = new Properties();
		FileInputStream file = new FileInputStream("src//test//resources//Config");
		prop.load(file);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
    }
	
	@Given("^User Enters Valid Username$")				
    public void EnterUsername() throws Throwable							
    {		
		driver.findElement(By.name("uid")).sendKeys(prop.getProperty("username"));
		Thread.sleep(1000);
		
		
    }
	
	@Given("^User enters Valid Password$")				
    public void EnterPassword() throws Throwable							
    {		
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		System.out.println(prop.getProperty("password"));
		Thread.sleep(1000);
		
		
    }
	
	@When("^User clicks on Login Button$")					
    public void ClickLogin() throws Throwable 							
    {		
       driver.findElement(By.name("btnLogin")).click();		
       Thread.sleep(3000);
    }
	
	@Then("^User should be taken to successful login page$")					
    public void SuccessLogin() throws Throwable 							
    {    		
        String loginMsg = driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();	
        System.out.println(loginMsg);
        Assert.assertEquals(loginMsg, "Welcome To Manager's Page of Guru99 Bank");
        Thread.sleep(1500);
        driver.close();
    }	

}
