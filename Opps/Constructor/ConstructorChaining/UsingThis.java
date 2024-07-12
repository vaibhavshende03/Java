package ConstructorChaining;

/*
Constructor chaining is the process of calling one constructor from another constructor with respect to current object.

The this() expression should always be the first line of the constructor.

 */

//use this() for same class
public class UsingThis {

    // default constructor 1

    UsingThis(){
        System.out.println("default");
    }

    // parameterized constructor 2
UsingThis(int x){
    // invokes default constructor
    this();
    System.out.println(x);
}
// parameterized constructor 3

    UsingThis(int x,int y){
        // invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);

    }

    public static void main(String[] args) {
       UsingThis ut= new UsingThis(10,8);
    }
}
