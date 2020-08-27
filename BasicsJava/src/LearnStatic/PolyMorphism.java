package LearnStatic;

public class PolyMorphism {

	public static void main(String[] args)
	{
	System.out.println("main method");
	ParentClass PC=new ParentClass();
	ParentClass CC=new ChildClass();
	ChildClass CN=new ChildClass();
	PC.m2();
	CC.m2();
	CN.m2();
	}
  
}
class ParentClass
{
	void m1()
	{
	System.out.println("Parent classs method"); 
	}
	void m2()
	{
		System.out.println("method 2 created in Parent class");
	}
	
}
class ChildClass extends ParentClass
{
	void m1()
	{
		
	System.out.println("Child class method");  
	}
}
