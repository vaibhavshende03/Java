import java.util.Scanner;

public class inputMethod {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// takinng string as input

		// takes only first word
		System.out.println("Enter The string : ");
		String s = sc.next();
		System.out.println("Enter string Is: " + s);
		System.out.println("---------------------------------------------");

		// Taking Integer as input
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		System.out.println("Enter Number Is: " + num);
		System.out.println("---------------------------------------------");

		// takes whole line as input
		System.out.println("Enter The string : ");
		String sL = sc.nextLine();
		System.out.println("Enter string Is: " + sL);
		System.out.println("---------------------------------------------");

		// takinng float as input
		System.out.println("Enter The FLoat Number : ");
		float num_f = sc.nextFloat();
		System.out.println("Enter Float Number Is: " + num_f);
		System.out.println("---------------------------------------------");

		// takes character as input
		System.out.println("Enter : ");
		char ch = sc.next().charAt(0);
		System.out.println("Enter  Is: " + ch);
		System.out.println("---------------------------------------------");

		sc.close();
	}
}