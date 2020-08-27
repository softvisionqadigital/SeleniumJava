package LearnStatic;

public class staticblock {
	
	static
	{	
		 int i=10;
		System.out.println("static block- will be executed first");
	}
	
	{
		System.out.println("Non static block- will be executed when a object is created");
	}
	
	staticblock()  //Constructor
	{		
		System.out.println("Constructor -will be executed when a object is created");
	}
	static void me1()
	{
		 int t=10;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main");
		staticblock SB=new staticblock();
		int i=10;
		System.out.println(i);
		
	}
	
	

}
