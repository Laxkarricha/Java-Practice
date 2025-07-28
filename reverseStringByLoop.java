public class reverseStringByLoop {

    public static void main(String[]orgh){
        String A= "Richa";
        String Rev = "";
        for (int i = A.length()-1; i>=0; i--){
        Rev +=A.charAt(i);

        }
        System.out.println(Rev);
    }
    
}
