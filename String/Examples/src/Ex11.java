public class Ex11 {
    // write a program to reverse a given String
    public static void reverse(String s){
        for (int i = s.length()-1; i >=0; i--) {
            System.out.print(s.charAt(i));

        }
        System.out.println();
    }



    public static void main(String[] args) {
        String s="Learning Java";
        System.out.println("======================");
        reverse(s);
        System.out.println("======================");

    }
}
