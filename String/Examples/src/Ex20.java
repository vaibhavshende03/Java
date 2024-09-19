import java.util.Scanner;

public class Ex20 {
// Write a program to check if it is a valid password or not

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Password:");
        String password=sc.next();

        if (password!=null && password.length()>=8){
            int upperCase=0,lowerCase=0,specialChar=0,digit=0;
            for (int i = 0; i < password.length(); i++) {
                char ch=password.charAt(i);

                if(ch>='A' && ch<='Z'){
                    upperCase++;
                } else if (ch>='a' && ch<='z') {
                    lowerCase++;
                }
                else if(ch>='0' && ch<='9'){
                    digit++;
                }
                else {
                    specialChar++;
                }
            }

            if (upperCase>0 && lowerCase>0 && digit>0 && specialChar>0){
                System.out.println("It is Strong Password.");
            }
            else {
                System.out.println("It is not Strong Password.");
            }
        }
        else {
            System.out.println("The length of the password must be at least 8 characters");
        }


    }
}
