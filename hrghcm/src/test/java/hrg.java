import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class hrg {

	public static void main(String[] args) throws InterruptedException {
		
//		By balanceleave=By.cssSelector("div[id='assignleave_leaveBalance']");
		
		WebDriver driver=utilities.BrowserFactory.browser("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		String dashboardText=driver.findElement(By.className("head")).getText();
		
		Assert.assertEquals(dashboardText, "Dashboard");
		driver.findElement(By.partialLinkText("Assign")).click();
		String assignLeaveText = driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
		
		Assert.assertEquals(assignLeaveText, "Assign Leave");
		
		driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("Russel Hamilton");
		Select leaveType= new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		leaveType.selectByVisibleText("Maternity US");
		
		/*
		 * WebDriverWait w=new WebDriverWait(driver, 5);
		 * w.until(ExpectedConditions.presenceOfElementLocated(balanceleave));
		 */
		Thread.sleep(4000);
		
		String leaveBalance = driver.findElement(By.cssSelector("div[id='assignleave_leaveBalance']")).getText();
		
		float leaveBal = Float.parseFloat(leaveBalance.split("(?<=\\D)(?=\\d)")[0]);
		System.out.println(leaveBal);
		
		if(leaveBal==0) {
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.id("menu_leave_Entitlements")))
			.click((driver.findElement(By.id("menu_leave_addLeaveEntitlement")))).build().perform();
			
			Thread.sleep(3000);
			
			WebElement eName = driver.findElement(By.id("entitlements_employee_empName"));
			eName.sendKeys("Russel");
			eName.sendKeys(Keys.ARROW_DOWN);
			eName.sendKeys(Keys.ENTER);
			
			Select leaveTypeForEntitling=new Select(driver.findElement(By.name("entitlements[leave_type]")));
			leaveTypeForEntitling.selectByVisibleText("Maternity US");
			
			Select leavePeriod=new Select(driver.findElement(By.id("period")));
			leavePeriod.selectByVisibleText("2020-01-01 - 2020-12-31");
			
			driver.findElement(By.id("entitlements_entitlement")).sendKeys("10");
			driver.findElement(By.id("btnSave")).click();
			
			Thread.sleep(4000);
			
			/*
			 * WebDriverWait w=new WebDriverWait(driver, 5);
			 * w.until(ExpectedConditions.presenceOfElementLocated(By.id(
			 * "menu_leave_assignLeave")));
			 */			 
			
			driver.findElement(By.id("menu_leave_assignLeave")).click();
			driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("Russel Hamilton");
			Select leaveTypeAfterEntitlement= new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
			leaveTypeAfterEntitlement.selectByVisibleText("Maternity US");
			
			/*
			 * driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]")).
			 * click(); Thread.sleep(10000); driver.findElement(By.
			 * xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active'" +
			 * " || 'ui-state-default ui-state-highlight ui-state-active']")).click();
			 */
		}
		driver.findElement(By.id("assignleave_txtFromDate")).clear();
		driver.findElement(By.id("assignleave_txtFromDate")).sendKeys("2020-06-22");
		driver.findElement(By.id("assignleave_txtToDate")).clear();
		driver.findElement(By.id("assignleave_txtToDate")).sendKeys("2020-06-22");
		driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]")).click();
		
		Thread.sleep(4000);
		Select duaration= new Select(driver.findElement(By.name("assignleave[duration][duration]")));
		duaration.selectByValue("full_day");
		
		driver.findElement(By.name("assignleave[txtComment]")).sendKeys("Testing");
		driver.findElement(By.id("assignBtn")).click();
	}
}
