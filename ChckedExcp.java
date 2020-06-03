package JavaBasics;

public class ChckedExcp
{
public static void main(String[] args)
{
	try
	{
		//Code that may raise exception
		int data=100/0;
	}
	catch(Exception E)
	{
		System.out.println(E);
		//Rest of the code
	}
}
}
