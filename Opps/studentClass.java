package Opps;

public class studentClass {
    // Creating new Data Type stores multiple values
//    public static class student {
//        String name;
//        int rollNo;
//        double percentage;
//    }

    public static void change(student s){
        s.name="Rohan";
    }

    public static void main(String[] args) {
        student s1 = new student();// Declaration
        s1.name = "Vaibhav";
        s1.rollNo = 1;
        s1.percentage = 90.20;
        System.out.println(s1.name);

        student s2 = new student();
        s2.name = "Lokesh";
        s2.rollNo = 2;
        s2.percentage = 92.5;
        System.out.println(s2.name);
    change(s2);
        //----------------------------------
        System.out.println(s2.name);

    }
}
