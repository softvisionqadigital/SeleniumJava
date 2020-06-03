// Java program to illustrate Constructor Chaining to 
// other class using super() keyword 
public class TempConstDiffClass{
        String name;

        // constructor 1
        TempConstDiffClass ()
        {
            this("");
            System.out.println("No-argument constructor of" +
                    " base class");
        }

        // constructor 2
        TempConstDiffClass (String name)
        {
            this.name = name;
            System.out.println("Calling parameterized constructor"
                    + " of TempconstDifference");
        }
    }

    class Derived extends TempConstDiffClass
    {
        // constructor 3
        Derived()
        {
            System.out.println("No-argument constructor " +
                    "of derived");
        }

        // parameterized constructor 4
        Derived(String name)
        {
            // invokes base class constructor 2
            super(name);
            System.out.println("Calling parameterized " +
                    "constructor of derived");
        }

        public static void main(String args[])
        {
            // calls parameterized constructor 4
            Derived obj = new Derived("test");

            // Calls No-argument constructor
            // Derived obj = new Derived();
        }
    }