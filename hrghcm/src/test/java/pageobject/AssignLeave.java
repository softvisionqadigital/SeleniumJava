package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignLeave extends BasePage {

	public AssignLeave(WebDriver driver) {
		super(driver);
	}

	By assignleaveText = By.xpath("//div[@class='head']/h1");
	By employeeName = By.name("assignleave[txtEmployee][empName]");
	By leaveType = By.id("assignleave_txtLeaveType");
	By leaveBalanceText = By.cssSelector("div[id='assignleave_leaveBalance']");
	By fromDate = By.id("assignleave_txtFromDate");
	By toDate = By.id("assignleave_txtToDate");
	By toDateCalender = By.xpath("(//img[@class='ui-datepicker-trigger'])[2]");
	By duaration = By.name("assignleave[duration][duration]");
	By commentBox = By.name("assignleave[txtComment]");
	By assignBtn = By.xpath("//input[@id='assignBtn']");

	public String assignPageNavigationValidation() {
		
		return find(assignleaveText).getText();
	}
	
	public void enterEmployeeName(String name) {
		find(employeeName).sendKeys(name);
	}
	
	public void selectLeaveType(String leaveTypeForEmployee) {
		Select leaveTypeDropdown = selectDropdown(leaveType);
		leaveTypeDropdown.selectByVisibleText(leaveTypeForEmployee);
	}
	
	public float getLeaveBalance() {
		String leaveBalance = find(leaveBalanceText).getText();
		float leaveBal = Float.parseFloat(leaveBalance.split("(?<=\\D)(?=\\d)")[0]);
		
		return leaveBal;
	}
	
	public void enterLeavePeriod(String date) {
		find(fromDate).clear();
		find(fromDate).sendKeys(date);
		find(toDate).clear();
		find(toDate).sendKeys(date);
		Click(toDateCalender);
	}
	
	public void enterComments(String message) {
		find(commentBox).sendKeys(message);		
	}
	
	public void clickAssignBtn() {
		Click(assignBtn);
	}
	public void assignLeave() {

		find(employeeName).sendKeys("Linda Anderson");
		Select leaveTypeDropdown = selectDropdown(leaveType);
		leaveTypeDropdown.selectByVisibleText("Vacation US");

		EntitlementPage.waitMethod();
		String leaveBalance = find(leaveBalanceText).getText();
		float leaveBal = Float.parseFloat(leaveBalance.split("(?<=\\D)(?=\\d)")[0]);
		float initialLeaveBal=leaveBal;
		System.out.println(leaveBal);
		if (leaveBal == 0) {
			EntitlementPage entitle = new EntitlementPage(driver);
			entitle.entitleLeave("Linda", "Vacation US", "10");

			find(employeeName).sendKeys("Linda Anderson");
			Select leaveTypeDropdownAfterEntitle = selectDropdown(leaveType);
			leaveTypeDropdownAfterEntitle.selectByVisibleText("Vacation US");
		}

		find(fromDate).clear();
		find(fromDate).sendKeys("2020-06-17");
		find(toDate).clear();
		find(toDate).sendKeys("2020-06-17");
		Click(toDateCalender);

		Select duarationDropdown = selectDropdown(duaration);
		duarationDropdown.selectByValue("full_day");

		find(commentBox).sendKeys("Testing");
		Click(assignBtn);
		EntitlementPage.waitMethod();
		String aferAssign=find(leaveBalanceText).getText();
		float afterAssigningLeave = Float.parseFloat(aferAssign.split("(?<=\\D)(?=\\d)")[0]);
		System.out.println("After assigning leave "+afterAssigningLeave);
		
	}
}
