package JavaBasics;

abstract class Demo
    {
	   public void myMethod()
	   {
	      System.out.println("Hello");
	   }
	   abstract public void anotherMethod();
	}
	public class AbstractDemo extends Demo
	{
	   public void anotherMethod()
	   { 
	        System.out.print("Abstract method"); 
	   }
	   public static void main(String args[])
	   { 
	      //error: You can't create object of it
	      AbstractDemo obj = new AbstractDemo();
	      obj.anotherMethod();
	   }
    }