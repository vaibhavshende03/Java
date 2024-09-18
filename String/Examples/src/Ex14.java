public class Ex14 {
    // Write a program to replace a character from a given string

    public static String replace(String s,char old,char newChar){
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if (ch==old){
                ans+=newChar;
            }
            else {
                ans+=ch;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="Hello";
        System.out.println(replace(s,'H','M'));
    }
}
