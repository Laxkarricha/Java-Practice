package String;

public class reverseStringWithRecurrsion {
    static String reverse(String Str){
        if(Str.isEmpty()){
            return Str;
        }
        return reverse(Str.substring(1))+ Str.charAt(0);
    }
    public static void main(String [] args){
        String s = "Richa";
        System.out.println(reverse(s));

    }
}
