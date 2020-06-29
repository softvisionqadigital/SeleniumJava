package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.AssignLeave;
import pageobject.Dashboard;
import pageobject.EntitlementPage;
import pageobject.HomePage;

public class StepDefinition {

	public WebDriver driver;
	public Dashboard dashboard;
	public AssignLeave assign;
	public EntitlementPage entitle;

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() {

		driver = utilities.BrowserFactory.browser("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@When("^User login with Username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_with_Username_and_password(String arg1, String arg2) {

		HomePage h = new HomePage(driver);
		h.login("admin", "admin123");
	}

	@Then("^Dashboard page is displayed$")
	public void dashboard_page_is_displayed() {

		dashboard = new Dashboard(driver);
		Assert.assertEquals("Dashboard", dashboard.dashboardLandingValidation());
	}

	@Given("^User is on Assign Leave page$")
	public void user_is_on_Assign_Leave_page() {
		dashboard.navigateToAssignLeave();
		assign = new AssignLeave(driver);
		Assert.assertEquals("Assign Leave", assign.assignPageNavigationValidation());
	}

	@When("^User enters the employee name$")
	public void user_enters_the_employee_name() {
		assign.enterEmployeeName("Linda Anderson");
	}

	@When("^enters the leave type which employee is availing$")
	public void enters_the_leave_type_which_employee_is_availing() {
		assign.selectLeaveType("Vacation US");
	}

	@When("^selects the date on which employee wants leave$")
	public void selects_the_date_on_which_employee_wants_leave() {
		assign.enterLeavePeriod("2020-01-15");
	}

	@When("^enters the requisite comment$")
	public void enters_the_requisite_comment() {
		assign.enterComments("Testing");
	}

	@When("^clicks on Assign button$")
	public void clicks_on_Assign_button() {
		assign.clickAssignBtn();
	}

	@Then("^leave is assign to employee successfully and remaining leaves is updated$")
	public void leave_is_assign_to_employee_successfully_and_remaining_leaves_is_updated() {

	}

	@Then("^remaining leaves for leave type is updated$")
	public void remaining_leaves_for_leave_type_is_updated() {

	}

	@When("^gets the leave balance for selected leave type$")
	public void checks_the_leave_balance_for_selected_leave_type() {
		assign.getLeaveBalance();
	}

	@Given("^User is on Dashboard page$")
	public void user_is_on_Dashboard_page() {
		
	}

	@When("^User click on assign leave$")
	public void user_click_on_assign_leave() {

	}

	@Then("^Assign Leave page is displayed$")
	public void assign_Leave_page_is_displayed() {

	}

	@When("^User calls the entitlement leave function to entitle the leave$")
	public void user_calls_the_entitlement_leave_function_to_assign_the_leave() {
		
		if (assign.getLeaveBalance() == 0) {
			entitle = new EntitlementPage(driver);
			entitle.entitleLeave("Linda", "Vacation US", "10");
		}
	}

	@When("^User navigates back to Assign Leave page and enters the employee name$")
	public void User_navigates_back_to_Assign_Leave_page_and_enters_the_employee_name() {

	}

	@Given("^User is on Add Entitlements Leave page$")
	public void user_is_on_Add_Entitlements_Leave_page() {

	}

	@When("^User enters the employee name in entitlement leave page$")
	public void user_enters_the_employee_name_in_entitlement_leave_page() {

	}

	@When("^selects the leave type which employee wants to get added$")
	public void selects_the_leave_type_which_employee_wants_to_get_added() {

	}

	@When("^selects the leave period$")
	public void selects_the_leave_period() {

	}

	@When("^enters the number of entitlement wants to assign$")
	public void enters_the_number_of_entitlement_wants_to_assign() {

	}

	@When("^clicks on save button$")
	public void clicks_on_save_button() {

	}

	@Then("^leave is entitled to employee successfully$")
	public void leave_is_entitled_to_employee_successfully() {

	}

}
