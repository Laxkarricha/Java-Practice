import java.util.*;

public class printNumbersFromMethods {
    static void printNumbers(int N){
        for(int i =1; i<=N; i++){
            if(i==N){
                System.out.print(i);
            }
            else {
                System.out.print(i+",");
            }
        }
    }
    public static void main(String [] args){
        printNumbers(25);
    }
    
}
