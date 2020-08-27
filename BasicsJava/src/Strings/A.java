package Strings;

public class A 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="communication had became a new verify ilove my country and i love ime";
		int count=0;
		char letterToCount='m';
		int Ns=s.length();
		for( int i = 0;i<=Ns-1;i++)
		{
			char sn=s.charAt(i);
			
			if(sn==letterToCount)
			{				
				count++;								
				
			}
			
			}
		System.out.println("-"+s+"-"+" has "+ count+" "+letterToCount+"'s");
		}
}
