import java.util.*;


public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int Stars = n-space;
        for (int i = 1; i<=n ; i++){
            for (int j = 1; j<=space; j++){
                System.out.print("\t");
            }
                for(int k = 1; k<=Stars; k++){
                    System.out.print("*\t");
                }
                
            space--;
            Stars++;
            System.out.println();
        }
    }
    
}
