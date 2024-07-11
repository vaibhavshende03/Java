package ConstructorOverloading;

public class Driver {

    public static void main(String[] args) {
        Form myForm1=new Form();
        myForm1.displayForm();
        System.out.println("--------------------------");
        Form myForm2=new Form("Vaibhav","xyz@gmail.com","India",1234567890l);
        myForm2.displayForm();
        System.out.println("--------------------------");
        Form myForm3=new Form("Vaibhav","xyz@gmail.com","India",1234567890l,"0",6.0);
        myForm3.displayForm();
        System.out.println("--------------------------");
    }

}
