package LearnStatic;

public class StaticUnderstanding 
{
	static int Svar=10;
	
	public static void main(String[] args) 
	{		
		StaticUnderstanding SU=new StaticUnderstanding();
		System.out.println("main method");
		SU.m2();
		SU.m1();
		System.out.println(Svar);
		
	}
	void m1()
	{
		Svar=15;
		
		System.out.println("m1 variable value "+Svar);
	}
	void m2()
	{
		System.out.println("M2 variable value "+Svar);
	}

}
