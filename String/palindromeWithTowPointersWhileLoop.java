package String;

public class palindromeWithTowPointers {
    public static void main(String [] args){
        String s = "madam";
        int start = 0;
        int end = s.length()-1;
        boolean type = true;

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                type = false;
                break;
            }
            start++;
            end--;
        }
        if(type){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
