package Opps.Has_A_Relationship;

class Address{
    String city,state,country;

    Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
//Address represent has-a relationship
public class Emp {

    int id;
    String name;
    Address address;

//    Emp Constructor
    Emp(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args){

        Address address1=new Address("Ngp","MH","IN");
        Address address2=new Address("Pune","MH","IN");

        Emp emp1=new Emp(1,"ABC",address1);
        Emp emp2=new Emp(2,"XYZ",address2);

        emp1.display();
        emp2.display();
    }

}
