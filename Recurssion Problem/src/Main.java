import java.util.*;

public class Main {
    public static void main(String[] args) {

       int[] a = new int[5] ;
       a[0] = 2 ;
       a[1] = 6 ;
       a[2] = 5 ;
       a[3] = 8 ;
       a[4] = 11 ;

      int[] data =  new int[2] ;
      data =twoSum(a,14) ;
      for (int i: data){
          System.out.print(i + " ");
      }



    }
    public static int[] twoSum(int[] a, int target){
        int[] result = new int[2] ;
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>() ;

        for(int i = 0 ; i<a.length; i++){
            if(myMap.containsKey(target - a[i])) {
                result[1] = i ;
                result[0] = myMap.get(target - a[i]) ;
                return result ;
            }
            myMap.put(a[i] ,i ) ;
        }
        return result ;
    }
}