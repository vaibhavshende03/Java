import java.util.Scanner;

class Algebra {

    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

    int sub(int a, int b) {
        int ans = a - b;
        return ans;
    }
}

public class addSub {

    public static void main(String[] Args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum  of a and b is : ");
        int ans = obj.add(x, y);
        System.out.println(ans);
        System.out.println("Subtraction  of a and b is : ");
        ans = obj.sub(x, y);
        System.out.println(ans);
        sc.close();
    }

}