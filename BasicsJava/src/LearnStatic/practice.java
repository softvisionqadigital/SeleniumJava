package LearnStatic;

public class practice {
	
	practice()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("non static block");
	}

	public static void main(String[] args) 
	{
		
  practice pt=new practice();
	}

}
