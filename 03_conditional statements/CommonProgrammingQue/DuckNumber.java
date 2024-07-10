class DuckNumber {
    public static void main(String[] args) {
        int num = 012034;
        int count = 0;
        int count1 = 0;
        while (num > 0) {
            int last = num % 10;
            if (last == 0) {
                count++;
                break;
            } else {
                count1++;
            }

            num = num / 10;
        }
        if (count > 0) {
            System.out.println("It is a duck number");
        } else if (count1 > 0) {
            System.out.println("It is not a duck number");
        }

    }

}