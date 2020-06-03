public interface Testable {
    void Test();
}
//Implementation: by second user
class Testter implements Testable{
    public void Test(){System.out.println("Testing app");}
}
class APiTest implements Testable{
    public void Test(){System.out.println("Testing app dran");}
}
//Using interface: by third user
class TestInterface1{
    public static void main(String args[]){
        Testable d=new APiTest ();
        d.Test();
    }}
