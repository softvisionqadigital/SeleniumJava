package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.UploadPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class UploadTest extends TestUtilities {

	@Test(dataProvider = "files")
	public void Upload(int number, String fileName) {
		WelcomePage welcomepage = new WelcomePage(driver, log);
		welcomepage.openpage();
		UploadPage uploadpage = welcomepage.ClickFileUpload();
		uploadpage.UploadFile(fileName);
		uploadpage.VerifyFile(fileName);
	}
}
