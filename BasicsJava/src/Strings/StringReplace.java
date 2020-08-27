package Strings;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="new string new Testing";
		System.out.println(s.replace('n', 'T'));
		System.out.println(s.replaceAll("new", "Test"));
		// replaceFirst>> this method replaces the old string with new string , but with the first occurrence of the string object.
		System.out.println(s.replaceFirst("new", "P"));

	}

}
