package com.herokuapp.theinternet;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class DropdownTest extends TestUtilities{

	@Test
	public void Dropdown() {
		WelcomePage welcomepage =new WelcomePage(driver,log);
		welcomepage.openpage();
		DropdownPage dropdownpage=welcomepage.ClickDropdown();
		dropdownpage.SelectOption(2);
		dropdownpage.ValidateDropdown();
	}

}
