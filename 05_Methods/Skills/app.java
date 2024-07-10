package Skills;

public class app {
        public String str_1 = "I am Public member";

        void print_from_class() {
                System.out.println("Within Class: " + str_1);
        }

        public static void main(String[] args) {
                app obj = new app();
                obj.print_from_class();
                System.out.println("with in class: "+obj.str_1);
                app_2 obj2=new app_2();
                obj2.printFromOutSideClass();

        }
}

class app_2 {

        void printFromOutSideClass(){
                app obj=new app();
                System.out.println("within pacakge outside class: "+obj.str_1);
        }

}
