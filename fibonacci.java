import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=2;
        int b=3;
        for(int i =0; i<n; i++){
            System.out.println(a);
            int c = a+b;
            a =b;
            b=c;


        }

    }
    
}
