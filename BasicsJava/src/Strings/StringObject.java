package Strings;

public class StringObject {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s=new String("new");
		s.concat("concat");
		System.out.println("s value :"+s);// prints only "new"
		
		
		String s1=new String("new");
		s1=s.concat("conat 2");
		System.out.println("s1 value :"+s1);
		
//changes made to existing object will not be affected to the object. If we want to make any changes to the existing object, we need to create a new object, 
		//so that the changes are affected to the new object.
	}

}
