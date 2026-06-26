package numbers;

public class reverseWithSB {
    public static void main(String[] args) {

        int num = 12345;

        String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();

        System.out.println(reversed);
    }
}