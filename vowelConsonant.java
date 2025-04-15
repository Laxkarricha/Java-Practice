import java.util.*;

public class vowelConsonant {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char A = sc.nextLine().toLowerCase().charAt(0);
        if(A == 'a'||A == 'e'||A == 'i'||A == 'o'||A == 'u' ){
            System.out.println("Yes");
        } else{
            System.out.println("NO");
        }

    
    }
    
}
