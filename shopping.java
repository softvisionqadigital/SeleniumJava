package JavaBasics;

public class shopping 
{
public void jeans()
{
	System.out.println("all type jeans");
}
}
class maxstore extends shopping
{
public void jeans()
{
	System.out.println("Black clr jeans");
}
}
class reliancestore extends shopping
{
public void jeans()
{
	System.out.println("Blue clr jeans");
}
}

class mainStore
{
	public static void main(String[] args)
	{
		shopping shp=new shopping();
		maxstore mx=new maxstore();
		//reliancestore rel=new reliancestore();
		
		mx.jeans();
	}
}
