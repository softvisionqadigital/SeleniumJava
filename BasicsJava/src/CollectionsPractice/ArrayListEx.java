package CollectionsPractice;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) 
	{
		ArrayList<String> Ar=new ArrayList<String>();
		Ar.add("test");
		Ar.add("array");
		Ar.add("list");
		System.out.println(Ar);
		Ar.add(0,"New");
		System.out.println(Ar);
		Ar.remove(0);
		System.out.println(Ar);
		Ar.remove("test");
		System.out.println(Ar);
		System.out.println(Ar.get(1));
		System.out.println(Ar.contains("list"));
		System.out.println(Ar.indexOf("list"));
		System.out.println(Ar.isEmpty());
		System.out.println(Ar.size());
	}

}
