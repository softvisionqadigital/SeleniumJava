abstract class AbstractClass{
    public void display(){
        System.out.println("Concrete method of parent class");
    }
    abstract public void disp2();
}

class MyClass extends AbstractClass{

    public void disp2()
    {
        System.out.println("overriding abstract method");
    }
    public static void main(String args[]){
        MyClass obj = new MyClass();
        obj.disp2();
    }
}