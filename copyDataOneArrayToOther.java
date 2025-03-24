import java.util.*;

public class copyDataOneArrayToOther {
    public static void main (String[] args){
        int [] Array = {2,5,8,7,3,4,6};
        int [] copiedArray = new int [Array.length];
        for (int i=0; i<Array.length; i++){
            copiedArray[i]=Array[i];
        }


        System.out.println(Arrays.toString(copiedArray));

    }

    
}
