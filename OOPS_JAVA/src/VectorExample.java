import java.util.*;
public class VectorExample{
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("simple");
        v.add("test");
        v.add("vector");
        v.add("collection");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}  