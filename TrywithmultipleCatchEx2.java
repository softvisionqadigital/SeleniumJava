package JavaBasics;

public class TrywithmultipleCatchEx2
{
	public static void main(String[] args)
	{
		try
		{
		int[] input=new int[5];

        System.out.println(input[10]);
		
		}
		catch(ArithmeticException Art)
		{
			System.out.println("Arithmetic Exception Occurs" + Art);
		}
		
		catch(ArrayIndexOutOfBoundsException ArrayIssue)
		{
			System.out.println("Array Index problem" + ArrayIssue);
		}
		catch(Exception E)
		{
			System.out.println("Exception Occurs" + E);
			
		}
	}
}
