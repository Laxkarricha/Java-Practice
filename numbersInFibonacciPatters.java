import java.util.*;

public class numbersInFibonacciPatters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i<=A; i++){
            for(int j = 0; j<=i; j++){
                
                System.out.print(a +"\t");
                int c = a+b;
                a=b;
                b=c;
                
            }
            System.out.println();

        }
    }
    
}
