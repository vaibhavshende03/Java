import java.util.Scanner;

public class Odd {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();

                if (num % 2 == 0) {
                        System.out.println("Number Is Even");
                } else {
                        System.out.println("Number Is Odd");

                }
                sc.close();
        }
}