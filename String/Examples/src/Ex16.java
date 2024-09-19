import java.awt.*;
import java.util.Arrays;

public class Ex16 {
    // Write a program to check if two Strings are anagram or not

    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        if(s1.length()==s2.length()){
            char[] ch1= s1.toCharArray();
            char[] ch2=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            //--------------------------------------------------------------------------------
            //The equals() method checks whether two arrays are equal.
            // Note: Two arrays are consided equal if they share the same elements in the same order.
            //--------------------------------------------------------------------------------

            System.out.println("=============");
            System.out.println("Using equlas Method :");
            if (Arrays.equals(ch1,ch2)) {
                System.out.println("It is an anagram.");
            }
            else {
                System.out.println("It is not an anagram");

            }
            System.out.println("=============");
            //--------------------------------------------------------------------------------

            int i = 0;
            for (; i < s1.length(); i++) {
                if (ch1[i]!=ch2[i]){
                    System.out.println("It is not an anagram");
                    break;
                }


            }
            if (i==s1.length()){
                System.out.println("It is an anagram.");
            }


        }
        else {
            System.out.println("The length of string is not same,It is not an anagram");
        }
    }

}
