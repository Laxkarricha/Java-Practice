package String;

public class reverseStringWithPalindromeForLoop {
    public static void main(String []args){
        String s = "richa";
        int n = s.length();
        boolean B = true;

        for(int i = 0; i<n/2; i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                B = false;
                break;
            }
        }
        System.out.println(B? "yes": "no");

    }
}
