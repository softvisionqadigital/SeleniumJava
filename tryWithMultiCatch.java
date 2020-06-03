package JavaBasics;

public class tryWithMultiCatch
{
	public static void main(String[] args)
	{
		try
		{
		int[] i=new int[5];
		i[5]=50/0;
		
		}
		catch(ArithmeticException Art)
		{
			System.out.println("Arithmetic Exception Occurs" + Art);
		}
		
		catch(Exception E)
		{
			System.out.println("Exception Occurs" + E);
			
		}
	}

}
