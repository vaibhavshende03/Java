

//Given a string s,print all the substrings of s
// s=abcd

public class Ex1 {
    public static void main(String[] args) {
        String s = "abcd";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.print(s.substring(i,j)+" ");
            }

        }
    }
}
