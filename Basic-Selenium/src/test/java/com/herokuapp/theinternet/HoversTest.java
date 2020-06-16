package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HoversPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class HoversTest extends TestUtilities{

	@Test
	public void HoversTest() {
		WelcomePage welcomepage=new WelcomePage(driver,log);
		welcomepage.openpage();
		HoversPage hoverspage=welcomepage.ClickHovers();
		hoverspage.HoverTests(1);
	}

}
