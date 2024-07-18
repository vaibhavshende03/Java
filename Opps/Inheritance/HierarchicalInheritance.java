package Opps.Inheritance;

/*
//Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.
class Animal{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
void bark(){System.out.println("barking...");}
}
* */

  class cat extends Animal{
      void meow(){
          System.out.println("Meowing.......");
      }
  }
public class HierarchicalInheritance {
    public static void main(String[] args) {
        cat c=new cat();
        c.meow();
        c.eat();

    }
}
