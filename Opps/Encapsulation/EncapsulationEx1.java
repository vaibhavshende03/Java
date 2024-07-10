package Opps.Encapsulation;
class Person{

    private String name;
    private  int age;


    //getter method
    public String getName(){
        return  name;
    }
    public int getAge(){
        return age;
    }

    //setter method

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class EncapsulationEx1 {

    public static void main(String[] args){
        Person p=new Person();
        // Set the name and age using the setter methods
        p.setName("Vaibhav");
        p.setAge(21);
        // Get the name and age using the getter methods
        String name= p.getName();
        int age=p.getAge();
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }

}
