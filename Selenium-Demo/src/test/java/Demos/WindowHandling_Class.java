package Demos;

import org.testng.annotations.Test;

import com.learningDemo.WindowsHandling;

public class WindowHandling_Class {
	
	@Test
	public void handlingwindows() {
		try {
			WindowsHandling obj = new WindowsHandling();
			obj.HandlingMultipleWindows();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
