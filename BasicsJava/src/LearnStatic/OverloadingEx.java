package LearnStatic;

public class OverloadingEx
{
	int Add2Numbers(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	int Add3Numbers(int a, int b, int c)
	{
		int sum= a+b+c;
		return sum;
	}

	public static void main(String[] args) 
	{
		OverloadingEx vs=new OverloadingEx();
		int sum1=vs.Add2Numbers(10, 10);
		int sum2=vs.Add3Numbers(10, 10, 10);
		System.out.println("additoon of two numbers :"+sum1);
		System.out.println("additoon of Three numbers "+sum2);
	}

}
