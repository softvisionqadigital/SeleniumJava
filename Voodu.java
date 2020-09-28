package Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Voodu
{

@FindBy(id="inf_field_FirstName")
private static WebElement FirstName;

@FindBy(id="inf_field_LastName")	
private static WebElement LastName;

@FindBy(id="inf_field_Email") 
private static WebElement Email;

@FindBy(xpath="(//label[@for='inf_field_Company']//following-sibling::input)[1]")
private static WebElement Company;

@FindBy(id="inf_field_Phone1")
private static WebElement PhoneNo;

@FindBy(id="inf_misc_Howcanwehelp")
private static WebElement Help;

@FindBy(id="inf_custom_Whatisyourprimaryroleorjobfunction_Online / Digital Marketer")
private static WebElement RadioB;

public Voodu(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public static void First(String Fir)
{
	FirstName.sendKeys(Fir);
}

public static void Last(String Las)
{
	LastName.sendKeys(Las);
}
public static void EmailId(String Emai)
{
	Email.sendKeys(Emai);
}
public static void Company(String Com)
{
	Company.sendKeys(Com);
}
public static void PhoneNo(String Phn)
{
	PhoneNo.sendKeys(Phn);
}
public static void Help(String Hlp)
{
	Help.sendKeys(Hlp);
}
public static void RadioB()
{
	RadioB.click();
}

}
