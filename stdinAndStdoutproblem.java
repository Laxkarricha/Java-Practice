import java.util.*;

public class stdinAndStdoutproblem {
     public static void main( String[]args){
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    double d = sc.nextDouble();
    sc.nextLine(); 
    String my = sc.nextLine();
    sc.close();
        System.out.println("String:"  + my);
        System.out.println("Double:"  + d );
        System.out.println( "Int:"  +  i );  

}
}

