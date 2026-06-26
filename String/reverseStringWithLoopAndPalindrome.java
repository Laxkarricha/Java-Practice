package String;

public class reverseStringWithLoopAndPalindrome {
    public static void main(String[] args) {

        String s = "madam";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

