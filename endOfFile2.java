import java.util.*;
public class endOfFile2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int line =1;
        while(sc.hasNext()){
            String ab = sc.nextLine();
        System.out.println(line + " " + ab);
        line++;
        }
        sc.close();

    }
    
}
