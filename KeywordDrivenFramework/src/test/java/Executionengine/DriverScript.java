package Executionengine;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import config.ActionKeywords;
import utility.ExcelUtils;

public class DriverScript {

	public static Properties prop;

	@Test
	public void TestCaseExecution() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("src//test//resources//Config");
			prop.load(file);
			ExcelUtils.setExcelFile(prop.getProperty("ExcelPath"), prop.getProperty("ExcelSheet"));

			for (int i = 0; i <=8; i++) {
				String sActionKeyword = ExcelUtils.getCellData(i, 3);
				if (sActionKeyword.equals("InitiateBrowser")) {
					// This will execute if the excel cell value is 'openBrowser'
					// Action Keyword is called here to perform action
					ActionKeywords.InitiateBrowser();
				} else if (sActionKeyword.equals("OpenUrl")) {
					ActionKeywords.OpenUrl();
				} else if (sActionKeyword.equals("input_Email")) {
					ActionKeywords.input_Email();
				} else if (sActionKeyword.equals("click_next")) {
					ActionKeywords.click_next();
				} else if (sActionKeyword.equals("input_password")) {
					ActionKeywords.input_password();
				} else if (sActionKeyword.equals("click_PasswordNext")) {
					ActionKeywords.click_PasswordNext();
				} else if (sActionKeyword.equals("waitfor")) {
					ActionKeywords.waitfor();
				} else if (sActionKeyword.equals("closeBrowser")) {
					ActionKeywords.closeBrowser();
				} 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
