package JavaBasics;

public class College 
{
public void subject()
{
	System.out.println("6 subjects");
}
}
class maths extends College
{
	public void subject()
	{
		System.out.println("Easy");
	}
}
class science extends College
{
	public void subject()
	{
	System.out.println("Tough");
}
}
class base
{
	public static void main(String[] args)
	{
		College clg=new College();
		science sci=new science();
		maths math=new maths();
		
		clg.subject();
		sci.subject();
		math.subject();
		
		
	}
}
