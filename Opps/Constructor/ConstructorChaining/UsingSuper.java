package ConstructorChaining;

public class UsingSuper {
    String name;
// constructor 1
UsingSuper(){

    System.out.println("No-argument constructor of" +
            " base class");
}
// constructor 2
    UsingSuper(String name){
    this.name=name;
        System.out.println("Calling parameterized constructor"
                + " of base");
    }


}

class Derived extends UsingSuper{

    Derived()
    {
        System.out.println("No-argument constructor " +
                "of derived");
    }

    // parameterized constructor 4
    Derived(String name) {
        // invokes base class constructor 2
    super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }

    public static void main(String[] args) {
        // calls parameterized constructor 4
        Derived obj1=new Derived("Test, Hello.....!");

        // Calls No-argument constructor
        Derived obj2=new Derived();
    }
}