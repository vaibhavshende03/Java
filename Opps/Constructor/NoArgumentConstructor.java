package Constructor;
class Mobile{
    String brand;
    String name;
    double price;
    String color;
//NoArgumentConstructor
    Mobile(){
        System.out.println("Message from NoArgument");
    }
    public void display(){
        System.out.println(brand);
        System.out.println(name);
        System.out.println(price);
        System.out.println(color);
    }
}

public  class NoArgumentConstructor {
    public static void main(String[] args){
        Mobile m1=new Mobile();
        m1.display();
    }
}