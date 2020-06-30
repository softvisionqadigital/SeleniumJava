package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HorizontalSliderPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class HorizontalSliderTest extends TestUtilities {

	@Test
	public void HorizontalSlider() {
		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		HorizontalSliderPage horizontalsliderpage = welcomepage.ClickHorizontalSlider();
		horizontalsliderpage.MoveSlider("0.5");
		horizontalsliderpage.VerifyValue("0.5");
	}
}
