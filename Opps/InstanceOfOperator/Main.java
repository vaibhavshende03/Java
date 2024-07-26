package Opps.InstanceOfOperator;


class A {
    int x=10;

    public void Test()
    {
        System.out.println("From Class A");
    }
}


class B extends A{
    String x="Hello World";

    public void Test()
    {
        System.out.println("From class B");
    }

    public void display()
    {
        System.out.println(x);
        System.out.println(super.x);

        System.out.println("----------------------------");

        Test();
        super.Test();

        System.out.println(this);

        //System.out.println(super);// CTE
    }

}


public class Main {
    public static void main(String[] args) {
        B b1=new B();
        System.out.println(b1 instanceof B);
        System.out.println(b1 instanceof A);

        A a1=new A();

        System.out.println("------------------------------------");

        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof B);

    }
}