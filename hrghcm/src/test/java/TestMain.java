import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageobject.AssignLeave;
import pageobject.Dashboard;
import pageobject.HomePage;

public class TestMain {
	public static void main(String[] args) {

		WebDriver driver = utilities.BrowserFactory.browser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		HomePage h = new HomePage(driver);
		h.login("admin", "admin123");

		Dashboard d = new Dashboard(driver);
		Assert.assertEquals("Dashboard", d.dashboardLandingValidation());

		d.navigateToAssignLeave();
		AssignLeave a = new AssignLeave(driver);
		a.assignLeave();
	}

}
