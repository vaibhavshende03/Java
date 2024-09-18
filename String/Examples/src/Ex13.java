public class Ex13 {
    // Write a program to convert a string into lowercase

    public static void main(String[] args) {
        String s="VAIBHav";
        String ans="";

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if (ch>='A' && ch<='Z'){
                ans+=(char)(ch+32);
            }
            else {
                ans+=ch;
            }
        }
        System.out.println(ans);

    }
}
