public class StringCompare {
    public static void main(String[] args) {
        String s="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";

        //equals() methods :check the original content of the strings.It compares values of string for equality.
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));
        System.out.println(s.equals(s4));
        System.out.println("======================");
        //By using == operator :compare the refernece not values

        System.out.println(s==s2);
        System.out.println(s==s3);
        System.out.println(s==s4);

        //compareTo() method
        System.out.println("------------------*****------------------");
        String s5="Ratan";
        System.out.println(s.compareTo(s2));//0(because same)
        System.out.println(s.compareTo(s5));//1 because s>s5
        System.out.println(s5.compareTo(s));//-1 because s5<s

    }
}
