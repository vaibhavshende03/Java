public class Ex21 {
// Write a program to find maximum repeated subsequence character of a given String

    public static void main(String[] args) {
        String s="aaaaaaaaaaaaabbbbbcccccc";
int max=0,count=0,index=0;
        for (int i = 0; i < s.length()-1; i++) {
            char ch=s.charAt(i);

            if (ch==s.charAt(i+1)){
                count++;
            }
            else {
                if (count>max){
                    max=count;
                    index=i;
                }
               count=0;
            }
        }
        if(count>max)
        {
            max=count;
            index=s.length()-1;
        }
        System.out.println(s.charAt(index)+" Element is repeated "+(max+1)+" number of times in the given string");

    }
}
