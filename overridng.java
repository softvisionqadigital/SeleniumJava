package JavaBasics;

public class overridng 
{
void parent()
{
	System.out.println("Base calss");
}
}
class over extends overridng
{
void parent2()
{
	//System.out.println("Example");
	System.out.println("Child class");
}
}

class mainClass1
{
	public static void main(String[] args)
	{
		overridng ovr=new over();
		ovr.parent();
	}
}
