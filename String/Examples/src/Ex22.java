//reverse the string
public class Ex22 {
    public static void main(String[] args) {
        String s = "Learning";
        StringBuilder sb = new StringBuilder(s);

        int left = 0, right = sb.length() - 1;

        while (left < right) {

            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }

        System.out.println(s);
        System.out.println(sb);
    }

}
