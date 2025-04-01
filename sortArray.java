
import java.util.*;

public class sortArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int [] arr = new int[A];
    
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        }
    
}
