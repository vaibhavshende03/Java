package Opps.Polymorphism;
//Run-Time Polymorphism or Method overriding
class Animal{

    void print(){
        System.out.println("Parent Class");
    }
}
class Dog extends Animal{
    void print(){
        System.out.println("Dog Barks......");
    }
}

class Cat extends Animal{
    void print(){
        System.out.println("Cat Meows........");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        System.out.println("--------------------------");

        Animal obj1=new Animal();
    obj1.print();
        System.out.println("--------------------------");
        Animal obj2=new Dog();
        obj2.print();
        System.out.println("--------------------------");
Animal obj3=new Cat();
obj3.print();
        System.out.println("--------------------------");


    }
}
