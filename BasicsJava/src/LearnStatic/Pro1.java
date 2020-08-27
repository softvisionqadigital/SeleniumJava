package LearnStatic;

public class Pro1 {
	
	int RollNumber;
	String Name;
	static String CollegeName= "MTIET";
	 Pro1(int R,String N)
	{
		 RollNumber=R;
		 Name=N;
	}
	
	 
	 void print()
	 {
		 System.out.println(RollNumber+": "+Name+": "+CollegeName);
	 }
	
	public static void main(String[] args) 
	{
		Pro1 Student1=new Pro1(1,"theju");
		Pro1 Student2=new Pro1(2,"Sree");
	    Pro1 Student3=new Pro1(3,"Arpi");
		
	    Student1.print();
		Student2.print();
		Student3.print();
		
		
	}
	

 
 
}
