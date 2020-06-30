package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DragandDropPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class DragandDropTest extends TestUtilities {

	@Test
	public void DragandDropFunction() {

		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		DragandDropPage draganddroppage = welcomepage.ClickDragandDrop();
		draganddroppage.DragandDropA();
		draganddroppage.VerifyDragandDrop();
	}

}
