import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

       int[] a = new int[4] ;
       a[0] = 2 ;
       a[1] = 7 ;
       a[2] = 11 ;
       a[3] = 15 ;

       int[] ans = new int[3] ;
       ans = twoSum(a,6) ;
       for (int i : ans){
           System.out.print(i + " ");
       }


    }
    public static int[] twoSum(int[] a, int target){
        for(int i = 0 ; i < a.length - 1; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] + a[j] == target){
                    return new int[] {i ,j} ;
                }
            }
        }
        throw new IllegalArgumentException("No Solution") ;
    }
}