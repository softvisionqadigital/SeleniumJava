package eachStepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import xpaths.Xpaths;

public class stepDefinitions{
	WebDriver driver;
	


	@Given("I have navigated to the application")
	public void i_have_navigated_to_the_application() {
		System.setProperty("webdriver.chrome.driver","/Users/abhi/Downloads/jar_files/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://aon-biw-dev.azurewebsites.net/");
		driver.manage().window().maximize();

	}

	@And("I have scrolled down to the footer section")
	public void i_have_scrolled_down_to_the_footer_section() throws InterruptedException {
		Xpaths obj = new Xpaths(driver);
		obj.scrollDown();
		}

	@Then("I shoiuld be able to see AON logo")
	public void i_shoiuld_be_able_to_see_aon_logo() {
		Xpaths obj = new Xpaths(driver);
		obj.findElement();
	}
	@Then("Check the usrl of globe logo")
	public void check_the_usrl_of_globe_logo() throws InterruptedException {
	    Xpaths obj = new Xpaths(driver);
	    obj.findLink();
	}
	
}