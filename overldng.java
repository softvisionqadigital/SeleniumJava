package JavaBasics;

public class overldng
{
static int Sum(int x, int y)
{
	return x+y;
}
static int Sum(int x, int y, int z)
{
	return x+y+z;
}
}
class methodOverloading
{
	public static void main(String[] args)
	{
		System.out.println(overldng.Sum(2,3));
		System.out.println(overldng.Sum(1,2,3));
	}
}

