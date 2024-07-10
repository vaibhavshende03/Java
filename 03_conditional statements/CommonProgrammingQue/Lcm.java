import java.util.Scanner;

class Lcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();

		System.out.println("Enter the second number");
		int n2 = sc.nextInt();

		int big = n1 > n2 ? n1 : n2;
		int i = 1;

		while (true) {
			if ((big * i) % n1 == 0 && (big * i) % n2 == 0) {
				System.out.println("The LCM of " + n1 + " and " + n2 + " is : " + (big * i));
				break;
			}

			big++;
		}

		sc.close();

	}

}