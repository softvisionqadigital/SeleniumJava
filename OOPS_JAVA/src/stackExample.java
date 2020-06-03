import java.util.*;
public class stackExample{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("simple");
        stack.push("test");
        stack.push("java");
        stack.push("collection");
        stack.push("stack");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}  