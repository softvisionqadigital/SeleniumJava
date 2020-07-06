package com.herokuapp.theinternet;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.SecureAreaPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class PositiveLoginTest extends TestUtilities {

	@Parameters({ "name", "password", "message" })
	@Test
	public void PositiveLogin(String name, String password, String message) {
		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		LoginPage loginpage = welcomepage.ClickFormAuth();
		takeScreenshot("Login Page");
		SecureAreaPage secureareapage = loginpage.PositiveLogInTest(name, password);
		String actual = secureareapage.GetMessage();
		Assert.assertTrue(actual.contains(message));
		secureareapage.Logout();
	}

}
