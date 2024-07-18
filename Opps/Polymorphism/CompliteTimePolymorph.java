package Opps.Polymorphism;
//Compile-time Polymorphism or method overloading.

class Features{
    void operator(String s1, String s2){
        String s=s1+s2;
        System.out.println("Concatenated String :"+s);
    }

    void operator(int a,int b){
        int c=a+b;
        System.out.println("Sum = "+c);
    }

    void operator(double a,double b){
        double c=a+b;
        System.out.println("Sum = "+c);
    }
}

public class CompliteTimePolymorph {
    public static void main(String[] args) {
        Features obj=new Features();
        obj.operator(5,10);
        obj.operator("Hello","World");
        obj.operator(10.5,5.5);
    }
}
