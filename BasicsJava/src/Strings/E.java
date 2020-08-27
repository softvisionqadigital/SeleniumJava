package Strings;

public class E {

	public static void main(String[] args)
	{
		String a="String1";
		String b="STRING1";
		int ss=a.compareTo(b);
		int sj=a.compareToIgnoreCase(b);
		System.out.println(ss);
		System.out.println(sj);
		if(ss==0)
		{
			System.out.println("both the strings are equal");
		}
		else System.out.println("both the strings are not equal");
		if(sj==0)
		{
			System.out.println("both the strings are equal");
		}
		else System.out.println("both the strings are not equal");
	}

}
/// compareTo method converts both the strings to unicode and then compares the strings and provide 0 as output if the both strings are equal 
//else it will provide negative /positive values if both the strings are not equal