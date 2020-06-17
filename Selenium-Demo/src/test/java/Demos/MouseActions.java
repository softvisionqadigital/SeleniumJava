package Demos;

import org.testng.annotations.Test;

import com.learningDemo.MouseKeyboardActions;

public class MouseActions {
	
	
	@Test
	public void performingMouseActions() {
		try {
			MouseKeyboardActions obj = new MouseKeyboardActions();
			obj.mouseAndKeyboardActions();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
