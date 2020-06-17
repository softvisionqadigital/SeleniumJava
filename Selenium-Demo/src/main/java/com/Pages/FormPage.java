package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.initDriver;

public class FormPage extends initDriver {
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/span/div/div[1]/div[2]/textarea")
	WebElement FormTitle;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/span/div/div[1]/div[2]/textarea")
	WebElement FormDesc;
	
	@FindBy(xpath="//textarea[contains(@data-initial-value,'Untitled Question')]")
	WebElement questiontitle;
	
	@FindBy(xpath="//div[contains(@class,'ViewItemActive')]//textarea[contains(@aria-label,'Question t') ][not (text())]")
	WebElement questiontitle2;
	
	@FindBy(xpath="//input[contains(@data-initial-value,'Option')]")
	WebElement option;
	
	@FindBy(xpath="//div[contains(@class,'ViewItemActive')]//input[contains(@aria-label,'Add')]")
	WebElement addoption;
	
	@FindBy(xpath="//div[contains(@class,'FatDesktop')]//div[contains(@data-tooltip,'Add question')]")
	WebElement addquestionbtn;
	
	@FindBy(xpath="//div[contains(@data-tooltip,'Setting')]")
	WebElement settingsbtn;
	
	@FindBy(xpath="/html/body/div[8]/div/div[2]/span/div/div/div[1]/div[3]/span")
	WebElement Quizoption;	

	@FindBy(xpath="/html/body/div[8]/div/div[2]/span/div/div/div[2]/span[3]/div/div/div[1]/label/div/div[1]/div[3]")
	WebElement togglebtn;	

	@FindBy(xpath="/html/body/div[8]/div/div[2]/div[3]/div[2]/span/span")
	WebElement savebtn;
	
	
	public FormPage(){
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public FormPage addTitle(String q) throws InterruptedException{
		FormTitle.click();
		FormTitle.sendKeys(q);
		Thread.sleep(1000);
		return new FormPage();
	}
	
	public void addFormDesc(String b) throws InterruptedException{
		FormDesc.click();
		FormDesc.sendKeys(b);
		Thread.sleep(1000);
	}
	
	public void addFirstQuestion(String q) throws InterruptedException{
		
		questiontitle.click();
		Thread.sleep(1000);
		questiontitle.sendKeys(q);
		Thread.sleep(1000);		
	}
	
	public void addNextQuestion(String q) throws InterruptedException{
		
		questiontitle2.click();
		Thread.sleep(2000);
		questiontitle2.sendKeys(q);
		Thread.sleep(1000);
	}
	
	public void addOption(){
		
		addoption.click();
		
	}
	

	public void optionvalue(String q) throws InterruptedException{
		
		option.click();
		option.sendKeys(Keys.CONTROL,"a");
		option.sendKeys(q);
		Thread.sleep(1000);
		
	}
	
	
	public void addExtraQuestion() throws InterruptedException{

		addquestionbtn.click();
		Thread.sleep(1000);
		
	}
	
	public void saveQuiz() throws InterruptedException{
		
		settingsbtn.click();
		Thread.sleep(500);
		Quizoption.click();
		Thread.sleep(1000);
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(togglebtn).click().build().perform();;
		//togglebtn.click();
		Thread.sleep(2000);
		//Actions action3 = new Actions(driver);
		action2.moveToElement(savebtn).click().build().perform();;
		
		
		
		
	}

}
