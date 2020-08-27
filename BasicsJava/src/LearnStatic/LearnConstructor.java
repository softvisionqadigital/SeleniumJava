package LearnStatic;

public class LearnConstructor 
{
 static int a=10;
	static
	{
		System.out.println("static blok");
	}

	public static void main(String[] args) 
	{
		
		System.out.println("main method");
		//LearnConstructor LC=new LearnConstructor();
		method1();
		
	}
	
 static void method1()
  {
	
	  LearnConstructor LC=new LearnConstructor();
	  
	  
			  
  }
}
