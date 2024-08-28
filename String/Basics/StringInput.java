import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        //it will take the input till it not hit to the space as it hit the space it terminate,
        // no matter there is another word/string is present in input/line.
//        String s=sc.next();

        String s= sc.nextLine();//it will take the whole input until next line
        System.out.println(s);
    }
}
