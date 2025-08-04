import java.util.*;

public class function1 {
    public static int fact(int x) {
        int rv = 1;
        for (int i = 1; i <=x; i++){
            rv *=i;
        }
        return rv;

        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            int A= sc.nextInt();
            int B = sc.nextInt();

            int C = fact(A);
            int D = fact(A-B);

            int F=C/D;
            System.out.println(F);

    }

    
}
