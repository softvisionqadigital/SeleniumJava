package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.AlertsPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class AlertsTest extends TestUtilities {

	@Test
	public void AlertsFunction() {
		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		AlertsPage alertspage = welcomepage.ClickAlerts();
		alertspage.JSAlertTest();
		alertspage.JSConfirmTest();
		alertspage.JSPromptTest();
	}

}
