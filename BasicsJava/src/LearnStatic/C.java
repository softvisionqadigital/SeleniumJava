package LearnStatic;

public class C 
{
	static int c;
	C()
	{
		c++;
	System.out.println(c);	
	}
	void Test()
	{
		c++;
	System.out.println(c);	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		C c1=new C();
		C c2=new C();
		c2.Test();
		System.out.println(c);
	}

}
