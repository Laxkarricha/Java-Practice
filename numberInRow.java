import java.util.*;

public class numberInRow {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int value = 1;
    for (int i = 1; i<=a; i++){
        for (int j= 1; j<=i; j++){
            System.out.print(value + "");
            value++;

        }
        System.out.println();
    }
}
}
