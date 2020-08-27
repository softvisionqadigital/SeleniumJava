package LearnStatic;

public class B {

	int a;
	B()
	{
		a++;
	System.out.println(a);
	
	
	}
	void Test()
	{
		a++;
		System.out.println(a);
	
	}
	public static void main(String[] args)
	{
		
		B a1=new B();
		B a2=new B();
		B a3=new B();
		a1.Test();
		B a4=new B();
		
		//a2.Test();
		

	}

}
