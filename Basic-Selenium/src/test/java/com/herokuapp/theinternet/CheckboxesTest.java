package com.herokuapp.theinternet;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckboxesPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class CheckboxesTest extends TestUtilities {

	@Test
	public void Checkboxes() {
		WelcomePage welcomepage=new WelcomePage(driver,log);
		welcomepage.openpage();
		CheckboxesPage checkboxesPage=welcomepage.ClickCheckboxes();
		checkboxesPage.ClickCheckboxes();
		Assert.assertTrue(checkboxesPage.VerifyCheckboxes());
	}
}
