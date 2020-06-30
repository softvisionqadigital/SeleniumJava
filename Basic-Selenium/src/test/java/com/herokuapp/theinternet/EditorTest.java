package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.EditorPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class EditorTest extends TestUtilities {

	@Test
	public void Editor() {

		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		EditorPage editorpage = welcomepage.ClickWYSIWYGEditor();
		editorpage.VerifyDefaultText();
	}

}
