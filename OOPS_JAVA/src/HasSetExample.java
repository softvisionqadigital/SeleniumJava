import java.util.*;
public class HasSetExample{
    public static void main(String args[]){
//Creating HashSet and adding elements  
        HashSet<String> set=new HashSet<String>();
        set.add("simple");
        set.add("test");
        set.add("java");
        set.add("hash");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}  