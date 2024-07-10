package Opps;

public class Employee {
    private int empId = 2;
    private String name;
    private int ph = 0;
    private int basicSal = 20000;
    private int incentive = 200;

    Employee(){}
    Employee(String empname, int phoneno){
        ph=phoneno;
        name=empname;
    }

    void countSalaries() {
        System.out.println(basicSal + incentive);
    }

//getter and setter

    public int getph() {
        return ph;
    }

   public  String getname() {
        return name;
    }


void setname(String name){
        this.name=name;
}
void setph(int phone){
        ph=phone;
}
}