import java.util.*;

public class leapYear {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        
        if(Year %4 ==0 && Year %100 !=0 ){
            System.out.println("It's a leap Year");
        } else {
            System.out.println("It's not leap Year");
        }

    }
    
}
