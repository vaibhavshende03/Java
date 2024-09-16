import java.util.*;

/*
ASCII value
A->65
a->97
0->48
 */
//Given  a string,the task is to toggle all the characters of the string
// i.e. to convert uppercase to lowercase and vice-versa.
public class Ex2 {

    public static void usingStringBuilder(){
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());

        for (int i=0;i<str.length();i++){
            boolean flag=true;//true-->means already capital value
            char ch=str.charAt(i);
            if (ch==' '){
                continue;
            }
            int ascii=(int)ch;
            if (ascii >= 97) {
                flag=false;
            }

            if (flag == true) {
                ascii=ascii+32;
                char tw=(char)ascii;
                str.setCharAt(i,tw);
            }
            else {
                ascii=ascii-32;
                char tw=(char) ascii;
                str.setCharAt(i,tw);
            }
        }
        System.out.println(str);
        sc.close();
    }

    public static void main(String[] args) {
        usingStringBuilder();
        System.out.println("======================================================");

    }
}
