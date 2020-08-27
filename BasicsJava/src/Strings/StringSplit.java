package Strings;

public class StringSplit {

	public static void main(String[] args) 
	{
		String s="string is a string and also a string";
		String[] s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			//System.out.println(s1[i]);	
		}
		
		String[] s2=s.split("also", 2);
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s2[i]);	
		}
	}

}
