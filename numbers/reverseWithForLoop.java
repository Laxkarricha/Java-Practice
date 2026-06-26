package numbers;

public class reverseWithForLoop {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;
        for (int i = 1; i <=4; i++) {
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
