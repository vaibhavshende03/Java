package Constructor;

class Laptop{
    String screen;
    String HDD;
    String SSD;
    String processor;

//    Parameterized Constructor
Laptop(String screen,String HDD,String SSD,String processor){
this.screen=screen;
this.HDD=HDD;
this.SSD=SSD;
this.processor=processor;
}

public void display(){
    System.out.println("------------------------------------");
    System.out.println("Message From Parameterized Constructor");
    System.out.println("------------------------------------");
    System.out.println(screen);
    System.out.println(HDD);
    System.out.println(SSD);
    System.out.println(processor);
    System.out.println("------------------------------------");

}
}

public class ParameterizedConstructor {
public static void main(String[] args){
Laptop l=new Laptop("HD Display","Samsung","Seagate","intel CORE i3");

l.display();
}
}
