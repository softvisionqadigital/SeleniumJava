package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EntitlementPage extends BasePage {

	public EntitlementPage(WebDriver driver) {
		super(driver);
	}

	By entitlementMenu = By.xpath("//a[@id='menu_leave_Entitlements']");
	By addLeaveMenu = By.xpath("//a[@id='menu_leave_addLeaveEntitlement']");
	By eName = By.id("entitlements_employee_empName");
	By leaveEntitleType=By.name("entitlements[leave_type]");
	By leavePeriod = By.id("period");
	By entitlment = By.id("entitlements_entitlement");
	By btnSave = By.id("btnSave");
	By assigneaveMenu = By.id("menu_leave_assignLeave");

	public void entitleLeave (String employeeName,String leaveType,String noOfLeave) {
		Actions action = new Actions(driver);
		//action.moveToElement(find(entitlementMenu)).click(find(addLeaveMenu)).build().perform();
		action.moveToElement(find(entitlementMenu)).build().perform();
		Click(addLeaveMenu);
		waitMethod();
		find(eName).sendKeys(employeeName);
		find(eName).sendKeys(Keys.ARROW_DOWN);
		find(eName).sendKeys(Keys.ENTER);

		Select leaveTypeForEntitling=selectDropdown(leaveEntitleType);
		leaveTypeForEntitling.selectByVisibleText(leaveType);
		
		Select leavePeriodDropdown= selectDropdown(leavePeriod);
		leavePeriodDropdown.selectByVisibleText("2020-01-01 - 2020-12-31");

		find(entitlment).sendKeys(noOfLeave);
		Click(btnSave);
		waitMethod();

		Click(assigneaveMenu);
	}

	public static void waitMethod() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
