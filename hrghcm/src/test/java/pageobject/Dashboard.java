package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard extends BasePage{
	private By dashboardText= By.className("head");
	private By assignleave=By.partialLinkText("Assign");
	
	public Dashboard(WebDriver driver) {
		super(driver);
	}
	
	public String dashboardLandingValidation() {
		return find(dashboardText).getText();
	}
	
	public void navigateToAssignLeave() {
		Click(assignleave);
	}
}
