package LearnStatic;

// when we have constructor overloading , 
//and we want few or all to be executed then we go for Constructor calling- by ending up  creating an object
//Constructor calling happens with in the class- 
//this() = used to call the constructor

public class ConstructorCalling {

	
	ConstructorCalling()
	{
		
		System.out.println("Constructor1");
	}
	ConstructorCalling(int a)
	{
		this();
		System.out.println("Constructor2");
	}
	ConstructorCalling(int a, int b)
	{
		this(10);
		System.out.println("Constructor3");
	}
	
	public static void main(String[] args)
	{
		ConstructorCalling CC=new ConstructorCalling(5, 10);
	}

}
