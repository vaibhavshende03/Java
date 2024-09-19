import java.util.Arrays;

public class Ex15 {
    // Write a program to convert a String to a string array

    public static int count(String ips){
        int count=1;

        for (int i = 0; i < ips.length(); i++) {
            char ch=ips.charAt(i);
            if (ch==' '){
                count++;
            }
        }
        return count;
        
    }

    public static String[] stringToArray(String s){
        String[] words=new String[count(s)];
        int wordIndex=0;
        String temp="";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                words[wordIndex]=temp;
                temp=" ";
                wordIndex++;
            }
            else {
                temp+=s.charAt(i);
            }

        }
        words[wordIndex]=temp;
        return words;
    }
    public static void main(String[] args) {
    String s="I Love My Country India";
    String[] ans=stringToArray(s);
        System.out.println(Arrays.toString(ans));
    }
}
