package Opps.Inheritance;



//class Animal{
//    void eat(){
//        System.out.println("Eating...........");
//    }
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("Barking...........");
//    }
//}

/*
 BabyDog class inherits the Dog class which again inherits the Animal class,
 so there is a multilevel inheritance.
*/

class babyDog extends Dog{
    void weep(){
        System.out.println("Weeping............");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        babyDog bd=new babyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}

