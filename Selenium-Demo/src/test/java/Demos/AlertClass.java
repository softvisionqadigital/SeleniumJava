package Demos;

import org.testng.annotations.Test;

import com.learningDemo.Alerts;

public class AlertClass {
	
	@Test
	public void AlertHandling() {
		try {
			Alerts obj = new Alerts();
			obj.handlingAlerts();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
