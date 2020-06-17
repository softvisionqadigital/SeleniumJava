package Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.FormPage;
import com.Pages.Homepage;
import com.Pages.LoginPage;
import com.base.ReadExcel;
import com.base.initDriver;

public class TestCases extends initDriver {
	
	public static LoginPage login;
	public static Homepage home;
	public static FormPage form;
	
	public static int row;
	public static int cellcount;
	public static String[][] data1;
	public static String[][] formDetl;
	public static int k;
	
	initDriver obj = new initDriver();
	
	public TestCases(){
		super();
				
	}
	
	@BeforeTest
	public void launchbrowser(){
		login = obj.initializeDriver();
	}
	
	@Test(priority=0)
	public void login() throws InterruptedException, IOException{
		form = login.toLogin();
		//form = home.addNewForm();
		
		Thread.sleep(2000);
		
		formDetl = ReadExcel.getExcelData(prop.getProperty("ExcelPath"), prop.getProperty("FormDetailSheet"));
		System.out.println(formDetl[0][0]);
		form.addTitle(formDetl[0][0]);
		
		form.addFormDesc(formDetl[0][1]);
		Thread.sleep(1000);
		
	}
	
	@Test(priority=1)
	public void getRowCount() throws IOException, InterruptedException{
		row = ReadExcel.RowCount(prop.getProperty("ExcelPath"), prop.getProperty("Questionssheet"));
		 System.out.println(row);
//		cellcount = ReadExcel.CellCount(prop.getProperty("ExcelPath"), prop.getProperty("Questionssheet"));
//		System.out.println(cellcount);
		data1 = ReadExcel.getExcelData(prop.getProperty("ExcelPath"), prop.getProperty("Questionssheet"));
		
	}
	
	@Test(priority=2)
	public void addquestions() throws InterruptedException, IOException{
		for(int i=0;i<row;i++){
			
			k = i+1;
			System.out.println("value of k is "+k);
			if(k>i){
				cellcount = ReadExcel.CellCount(prop.getProperty("ExcelPath"), prop.getProperty("Questionssheet"),k);
				System.out.println("Value of cell is "+cellcount);
				
			}
			
			if(i>0){
				form.addExtraQuestion();
			}
			
			if(i==0){
				form.addFirstQuestion(data1[i][0]);
				Thread.sleep(1000);
			}
			else{
				form.addNextQuestion(data1[i][0]);
				Thread.sleep(1000);
			}
			
			for(int j=1;j<cellcount;j++){
				form.optionvalue(data1[i][j]);
				Thread.sleep(1000);
				if(j!=cellcount-1){
					form.addOption();
					Thread.sleep(1000);
				}
			}
			
		}
		Thread.sleep(2000);
		
		form.saveQuiz();
		
		//driver.close();
		
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
	



}
