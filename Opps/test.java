package Opps;

import Opps.MyPackage2.MyClass;



public class test {
    public static void main(String[] args) {

        Employee enginner = new Employee();
        enginner.countSalaries();
//        System.out.println(enginner.empId);
        System.out.println(enginner.getname());
        System.out.println(enginner.getph());
Employee enginner2=new Employee();
        Employee enginner3=new Employee("Rahul",566698792);
        System.out.println(enginner3.getname());






    }
}
