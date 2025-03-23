import java.util.*;

public class convertIntToString {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if(s.equals(Integer.toString(n))){
            System.out.println("Good Job");
        }
     else 
     System.out.println("bad job");
    }


    
}
