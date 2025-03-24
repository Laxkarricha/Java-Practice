import java.util.*;


public class avrgNumberInArray {
    public static void main (String[] args){
    int [] Array = {8,6,4,8,5,5};
    int sum=0;
    for (int i =0; i<Array.length; i++){
        sum += Array[i];
    }
    System.out.println(sum/Array.length);


    }
    
}
