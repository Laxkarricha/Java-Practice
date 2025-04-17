public class largestArray {
    public static void main(String [] args){
        int [] A = {23,54,67,98,56,78};
        int max =0;
        for (int i =0; i<A.length; i++){
            if(A[i]>max){
                max=A[i];
            
            }
        }
        System.out.println(max);
    }
    
}
