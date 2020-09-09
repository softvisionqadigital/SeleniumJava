package CollectionsPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Hashset
		//Treeset
	   //LinkedHashset
		
		HashSet<String> h=new HashSet<String>();
		h.add("test");
		h.add("new");
		h.add("test");
		h.add("ny");
		h.add("myy");
		System.out.println(h);
		System.out.println(h.remove("new"));
		System.out.println(h);
		
		Iterator<String> i=h.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		
		
	
	}

}
