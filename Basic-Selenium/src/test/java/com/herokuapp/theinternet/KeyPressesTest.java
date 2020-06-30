package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class KeyPressesTest extends TestUtilities {

	@Test
	public void KeyPresses() {

		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		KeyPressesPage keypressespage = welcomepage.ClickKeyPresses();
		keypressespage.KeyPress();
		keypressespage.VerifyKeyPressed();
	}

}
