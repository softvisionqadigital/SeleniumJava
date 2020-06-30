package com.herokuapp.theinternet;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.herokuapp.theinternet.base.ExcelDataProvider;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class NegativeLoginTest extends TestUtilities {

	@Test(dataProvider = "ExcelReader", dataProviderClass = ExcelDataProvider.class)
	public void NegativeLogin(String number, String name, String password, String message, String scenario) {

		log.info("Starting Negative Login Test " + number + ":" + scenario);
		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		LoginPage loginpage = welcomepage.ClickFormAuth();
		loginpage.NegativeLogInTest(name, password);
		String actual = loginpage.GetMessage();
		Assert.assertTrue(actual.contains(message));
	}

}
