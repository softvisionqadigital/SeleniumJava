package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DynamicControlsPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class DynamicControlsTest extends TestUtilities {

	@Test
	public void dynamiccontrols() {

		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		DynamicControlsPage dynamiccontrolspage = welcomepage.ClickDynamicControls();
		dynamiccontrolspage.ValidateTextbox();
		dynamiccontrolspage.ValidateCheckbox();
	}

}
