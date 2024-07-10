package Opps;

public class fraction {

    public static class Fraction{
        int num;
        int deno;

        public Fraction(int num,int deno){
            this.num=num;
            this.deno=deno;
        }
    }

    public static  void main(String[] args){

        Fraction f1=new Fraction(3,7);

        System.out.println(f1.num+"/"+f1.deno);

        Fraction f2=new Fraction(21,7);

        System.out.println(f2.num+"/"+f2.deno);
    }

}
