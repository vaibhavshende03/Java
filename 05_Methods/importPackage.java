
// import Skills.app;
import Skills.*;

public class importPackage {
    public static void main(String[] args) {
        app obj = new app();
        System.out.println("outside Package,non-child class:"+obj   .str_1);
        app3 obj3=new app3();
        obj3.printFromChildClass();
    }

}

//    child class
class app3 extends app{
    void printFromChildClass() {
        app3 obj3=new app3();
        System.out.println("child class :"+obj3.str_1);
    }
}