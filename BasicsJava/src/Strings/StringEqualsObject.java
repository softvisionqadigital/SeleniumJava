package Strings;

public class StringEqualsObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("String1");
		String s1=new String("String1");
		
		if(s==s1) // "==" compares the reference of the variable
		{
		System.out.println("s and s1 are equal");	
		}
		else System.out.println("s and s1 are not equal");
		if(s.equals(s1)) // compares the values - > Preferable to use
		{
			
			System.out.println("s and s1 are equal");	
		}
		else System.out.println("s and s1 are not equal");

	}

}
