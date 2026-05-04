import java.util.*;

public class palindrome {
    public static void main(String[] args){
        String str = "madam";
        String reversed ="";

        for(int i= str.length()-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("This is palindrome");
        }


    }
}
