package LearnStatic;

public class ConstructorChaining2 extends ConstructorChaining
{	

	ConstructorChaining2(int r)
	{
		super(8);
		System.out.println("new one");
	}

public static void main(String[] args) 
{
	System.out.println("Constructor chaining child class");
	ConstructorChaining2 chd=new ConstructorChaining2(6);
	
	
}


}
