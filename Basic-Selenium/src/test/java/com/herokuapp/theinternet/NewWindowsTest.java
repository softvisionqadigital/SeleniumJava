package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.NewWindowsPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import com.herokuapp.theinternet.pages.WindowsPage;

public class NewWindowsTest extends TestUtilities {

	@Test
	public void NewWindows() {
		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		WindowsPage windowspage = welcomepage.ClickMultipleWindows();
		windowspage.Clickink();
		NewWindowsPage newwindowspage = windowspage.SwitchWindow();
		newwindowspage.VerifyNewWindow();
	}

}
