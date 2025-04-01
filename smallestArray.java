import java.util.*;

public class smallestArray {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int [] arr = new int[A];

        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int smallest = 0;
        for (int i=1; i<arr.length; i++){
            if (arr[i]<arr[smallest]){
                smallest = i;
            }
        }
        int temp =arr[0];
        arr[0] = arr[smallest];
        arr[smallest]= temp;

        System.out.println(arr[0]);

    }
    
}
