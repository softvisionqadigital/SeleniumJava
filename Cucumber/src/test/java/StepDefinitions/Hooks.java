package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{

	@Before("@RegressionTest")
	public void m1()
	{
		System.out.println("before Regresion test");
	}
	@After("@RegressionTest")
	public void m2()
	{
		System.out.println("After reg test");
	}
}
