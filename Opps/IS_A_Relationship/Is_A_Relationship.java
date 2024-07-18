package Opps.IS_A_Relationship;


/*Programmer is the subclass and Employee is the superclass.
The relationship between the two classes is Programmer IS-A Employee.
It means that Programmer is a type of Employee.
 */

class Employee{
    float salary=40000.00f;

}
class Programmer extends  Employee{
    int bonus=10000;

}

public class Is_A_Relationship {

    public static void main(String[] args) {
 Programmer p=new Programmer();
        System.out.println("Salary :"+p.salary);
        System.out.println("Bonus :"+p.bonus);
    }

}
