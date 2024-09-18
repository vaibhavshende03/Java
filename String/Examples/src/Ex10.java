public class Ex10 {

    // Write a program to sort all the characters of a given String

    public static String sort(String s){
        char[] ch=s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
               if (ch[i]>ch[j]){
                   char temp=ch[i];
                   ch[i]=ch[j];
                   ch[j]=temp;
               }
            }
        }

    return new String(ch);
    }

    public static void main(String[] args) {
        String s=" Hello World ";
        System.out.println(sort(s));
    }
}
