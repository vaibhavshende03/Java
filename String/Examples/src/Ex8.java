import java.util.Arrays;

public class Ex8 {
    // Write a  program in which method accepts a string and return character array

    public static char[] stringToCharArray(String s){
     char[] ch=new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i]=s.charAt(i);
        }

        return ch;

    }

    public static void main(String[] args) {
        String s="Hello World";
        char[] ans=stringToCharArray(s);

        System.out.println(Arrays.toString(ans));



    }
}
