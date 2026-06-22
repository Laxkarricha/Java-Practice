package String;
import java.util.*;

public class reverseStringWithLoop {
    public static void main(String [] args) {

        String s = "Richa";
        String rev = " ";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}

