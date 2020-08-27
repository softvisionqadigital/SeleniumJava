package Strings;

public class StringStartswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Programming";
		String s1="test Java";
		System.out.println(s.startsWith("Java"));
		System.out.println(s1.startsWith("Java"));
		
		System.out.println(s.startsWith("java"));// startswith method is case sensitive
		
		//checks for the specified string is existing in string object with specified start index.
		System.out.println(s.startsWith("Java",5 ));
		System.out.println(s1.startsWith("Java",5 ));
		
		
	}

}
